package ListNode;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
class Solution{
    //1.删除链表中等于给定值 val 的所有节点。
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        if(head.val == val){
            head = head.next;
            return removeElements(head,val);
        }
        ListNode prev = head;
        while(prev.next != null){
            ListNode node = prev.next;
            if(node.val == val){
                if(node.next == null){
                    prev.next = null;
                    continue;
                    // return removeElements(head,val);
                }
                prev.next = node.next;
                continue;
            }
            prev = prev.next;
        }
        return head;
    }
    //2.反转链表结点
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode node = cur.next;
            cur.next = prev;
            prev = cur;
            cur = node;
        }
        return prev;
    }
    //3.返回链表中间的结点
    public ListNode middleNode(ListNode head) {
        int size = getSize(head) / 2;
        ListNode node = head;
        for(int i = 0;i < size;i++){
            node = node.next;
        }
        return node;
    }
    //4.返回链表倒数第k个结点
    public ListNode FindKthToTail(ListNode head,int k){
        //需要对k的合法性做出检测
        if(k > getSize(head) || k < 0){
            return null;
        }
        ListNode node = head;
        for (int i = 0; i < getSize(head) - k; i++) {
            node = node.next;
        }
        return node;
    }
    //获取链表长度
    public int getSize(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }

    //5.将两个有序链表合并为一个新的有序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode node = head;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                node.next = l1;
                node = node.next;
                l1 = l1.next;
            }
            else{
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            }
        }
        if(l1 == null){
            node.next = l2;
        }
        else{
            node.next = l1;
        }
        return head.next;
    }
    //6.分割链表
    public ListNode partition(ListNode pHead, int x){
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode node1 = new ListNode(0);
        ListNode h1 = node1;//大数
        ListNode node2 = new ListNode(0);
        ListNode h2 = node2;//较小的数
        ListNode node = pHead;
        while(node != null){
            if(node.val >= x){
                h1.next = new ListNode(node.val);
                h1 = h1.next;
            }
            else{
                h2.next = new ListNode(node.val);
                h2 = h2.next;
            }
            node = node.next;
        }
        h2.next = node1.next;
        return node2.next;
    }
}
