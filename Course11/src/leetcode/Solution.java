package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    //二维网格迁移
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<Integer> list = new ArrayList<>();
        for (int[] link : grid){
            for (int item : link){
                list.add(item);
            }
        }
        k %= (m * n);
        while (k > 0){
            int last = list.size() - 1;
            Integer integer = list.remove(last);
            list.add(0,integer);
            k--;
        }
        List<List<Integer>> ret = new ArrayList<>(m);
        int i = 0;
        for (int j = 0; j < m; j++) {
            List<Integer> tempList = new ArrayList<>(n);
            for (int l = 0; l < n; l++) {
                tempList.add(list.get(i));
                i++;
            }
            ret.add(tempList);
        }
        return ret;
    }

    //主要元素
//    public int majorityElement(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//
//            if (!map.containsKey(nums[i])){
//                count = 0;
//                map.put(nums[i],++count);
//            }else{
//            }
//        }
//    }
    //杨辉三角

}