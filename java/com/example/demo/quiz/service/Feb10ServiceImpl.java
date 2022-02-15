package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.quiz.service
 * fileName      :   Feb09ServiceImpl
 * author        :   JeongMyeongHong
 * date          :   2022-02-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-10           최초 생성
 * <p>
 * jeonjonghyun         1번풀이
 * nohhongju            2번풀이
 * JeongmyoengHong      3번풀이
 * Yang Jeong-O         4번풀이
 * JungGyeongJun        5번풀이
 */
public class Feb10ServiceImpl implements Feb10Service {
    /**
     * author        :   JeongMyeongHong
     * desc          :
     */
    @Override
    public void bubbleSort() {//전종현
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void insertionSort() {//전종현
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void selectionSort() {//전종현
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    /*
     *  1인분
     * */
    @Override
    public void quickSort() {//노홍주
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    /**
     * author        :   JeongmyeongHong
     * desc          :
     */
    @Override
    public void mergeSort() {//노홍주
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    /**
     * author        :   JeongmyeongHong
     * desc          :
     * 홀수 마방진
     * 1. 정사각형의 맨 아랫줄 가운데에 숫자 1 을 둔다.
     * 2. 이전 숫자 위치에서 오른쪽 아래칸이 비어 있으면 다음 숫자를 채운다.
     * 3. 이전 숫자 위치에서 오른쪽 아래칸이 채워져 있으면 이전 숫자의 위칸에 다음 숫자를 채운다.
     * 4. 오른쪽 아래칸이 사각형의 영역 밖이면 다음의 규칙을 따른다.
     * 4-1. 수평 및 수직으로 이동해서 마지막 칸이 비어 있으면 해당 칸에 숫자를 채운다.
     * 4-2. 수평 및 수직으로 이동해도 칸이 없는 경우 이전의 숫자 위치 위쪽 칸에 다음 숫자를 채운다.
     */

    @Override
    public void magicSquare(int num) {//홍정명
        int[] square = new int[num * num];
        int nextIndex;

        if (num % 2 == 1) {
            int index = square.length - (int) (num / 2) - 1;

            square[index] = 1;
            for (int i = 2; i <= square.length; i++) {
                if ((index / num == (num - 1)) && (index % num == (num - 1))) {
                    nextIndex = 0;
                } else if (index / num == (num - 1)) {
                    nextIndex = (index + 1) % num;
                } else if (index % num == (num - 1)) {
                    nextIndex = index + 1;
                } else {
                    nextIndex = index + num + 1;
                }

                if (square[nextIndex] == 0) {
                    square[nextIndex] = i;
                    index = nextIndex;
                } else {
                    index = index - num;
                    square[index] = i;
                }
            }
            System.out.println("\n\n");
            for (int i = 0; i < square.length; i++) {
                System.out.print(square[i] + "     ");
                if (i % num == (num - 1)) {
                    System.out.println("\n");
                }
            }
        }

    }

    @Override
    public void zigzag() {//양정오
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0, ct = 0;
        int[][] ar = new int[n][n];

        while (ct < (n * 2) - 1) {
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if (a + b == ct) {
                        if (ct % 2 == 0) {
                            ar[a][b] = ++num;
                        } else {
                            ar[b][a] = ++num;
                        }
                    }
                }
            }
            ct++;
        }
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                System.out.printf("%2d ", ar[a][b]);
            }
            System.out.println("");
        }
    }

    @Override
    public void rectangleStarPrint() {//정경준
        int line = (int) (Math.random() * 15 + 1);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < line; i++) {
            for (int j = 5; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    @Override
    public void triangleStarPrint() {//정경준
        int line = (int) (Math.random() * 15 + 1);
        for (int i = line, add = 0; i > 0; i--, add++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < line - (i - 1) + add; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
