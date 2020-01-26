package ListNode7_;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
class Solution{
    //7.删除所有的重复结点
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode node = new ListNode(0);
        node.next = pHead;
        ListNode prev = node;
        ListNode cur = node.next;
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                prev.next = cur.next;
                cur = cur.next;
            }
            else{
                prev = prev.next;
                cur = cur.next;
            }
        }
        return node.next;
    }
    //8.链表的回文结构
    public boolean chkPalindrome(ListNode A){
        //笨办法：将所有的结点的数据拿出来，存放在数组里
        //按照数组从两边往中间检测
        int size = 0;
        for(ListNode node = A;node != null;node = node.next){
            size++;
        }
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = A.val;
            A = A.next;
        }
        int left = 0;
        int right = size - 1;
        while(left < right){
            if(temp[left] == temp[right]){
                left++;
                right--;
            }
            else
                return false;
        }
        return true;
    }
    //9.两个链表的相交结点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null){
            return null;
        }
        //双循环，执行结用时583ms
        for(ListNode anode = headA;anode!= null;anode = anode.next){
            for(ListNode bnode = headB;bnode != null;bnode = bnode.next){
                if(anode == bnode){
                    return anode;
                }
            }
        }
        return null;
    }
    //10.判断链表是否有环
    public boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){//遇到空指针已经跳出循环了
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    //11.返回链表开始入环的第一个结点,无环返回null
    public ListNode detectCycle(ListNode head){
        if(head == null){
            return null;
        }
        boolean hasCycle = false;
        ListNode slow = head;
        ListNode fast = head;
        //第一步：找环
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                hasCycle = true;
                break;
            }
        }
        //第二步：找入环的结点
        if(hasCycle){
            ListNode node = head;
            while(node != slow){
                slow = slow.next;
                node = node.next;
            }
            return node;
        }
        return null;
    }

}