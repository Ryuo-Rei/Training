package com.company;

public class Main {

    // 2020/09/01 10:30 ~　10:42
    public static void main(String[] args) {
        // write your code here
        int[][] numberArray = new int[9][9];

        // 99を表示するための2重ループ
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int sum = i * j;
                if(j == 9) {
                    if(sum < 10) {
                        System.out.println(" " + sum);
                    }
                    else {
                        System.out.println(sum);
                    }
                }
                else {
                    if(sum < 10) {
                        System.out.print(" " + sum + " ");
                    }
                    else {
                        System.out.print(sum + " ");
                    }
                }
            }
        }
    }
}
