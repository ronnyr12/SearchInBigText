package com.company;

public class StringPrac {
    public static void main(String[] args) {
        String[] stam_arr = {"dogy!", "15488", "6666.",
                "syntax errors"};
        System.out.println(q1_2019_exact(stam_arr, 6));
    }

    public static int q1_2019_exact(String[]arr, int num){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i].length())
                count++;
        }
        return count;
    }
}
