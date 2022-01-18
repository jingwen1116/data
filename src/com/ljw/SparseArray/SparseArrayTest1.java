package com.ljw.SparseArray;

/**
 * 二维数组棋子
 * @auther HP
 * @Date 2021/12/29 22:10
 */
public class SparseArrayTest1 {
    public static void main(String[] args) {

        int chessArr[][] = new int[11][11];

        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        chessArr[4][2] = 2;


        int tag = 0;
        int count = 0;
        for (int[] item : chessArr) {
            for (int data : item) {
                if (data!=0){
                    tag++;
                }
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将二维数组转为稀疏数组
        //稀疏数组 固定3列
        //第一列是 数组的行 第二列是数组的列 第三列是数组值的个数
        //第二行开始 记录数组的值的位置 和值到稀疏数组中
        int arr[][] = new int[tag+1][3];
        arr[0][0] = 11;
        arr[0][1] = 11;
        arr[0][2] = tag;


        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr.length; j++) {
                if (chessArr[i][j] !=0){
                    count++;
                    arr[count][0] = i;
                    arr[count][1] = j;
                    arr[count][2] = chessArr[i][j];
                }
            }
        }

        System.out.println("===================================");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }

    }
}
