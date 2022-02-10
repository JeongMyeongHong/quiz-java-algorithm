package com.example.demo.quiz.service;

/**
 * packageName   :   com.example.demo.quiz.service
 * fileName      :   Feb09ServiceHJM
 * author        :   JeongMyeongHong
 * date          :   2022-02-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-10      JeongMyoengHong     최초 생성
 */
public class Feb10ServiceHJM implements Feb10Service {
    /*
     *  1인분
     * */
    @Override
    public void bubbleSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void insertionSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void selectionSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    /*
     *  1인분
     * */
    @Override
    public void quickSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void mergeSort() {
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void magicSquare(int num) {
        int[] square = square(num);
        int sum = sum(num);




    }

    int sum(int num) {
        int s = 0;
        for (int i = 1; i < num * num + 1; i++) {
            s += i;
        }
        return s;
    }
    int[] square(int num) {
        int[] magic = new int[num];
        for (int i = 0; i < num * num + 1; i++) {
            magic[i] = 1 + 1;
        }
        return magic;
    }

    @Override
    public void zigzag() {

    }

    @Override
    public void rectangleStarPrint() {
        int edgeNum = (int) (Math.random() * 10 + 1);
        for (int i = 1; i <= edgeNum; i++) {
            for (int j = edgeNum - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        String s = "";
        for (int i = 1; i <= edgeNum; i++) {
            for (int j = 0; j < edgeNum; j++) {
                s += j < (edgeNum - i) ? " " : "*";
            }
            s += "\n";
        }
        System.out.println(s);
    }

    @Override
    public void triangleStarPrint() {
        int edgeNum = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < edgeNum; i++) {
            for (int j = edgeNum - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
