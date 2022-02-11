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
 *     -                 -            8번 9번 완료.
 * 2022-02-11            -            6번 홀수 완료.
 *
 */
public class Feb10ServiceHJM implements Feb10Service {
    /*
     *  1인분
     * */
    @Override
    public void bubbleSort() {//1번
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void insertionSort() {//2번
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void selectionSort() {//3번
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    /*
     *  1인분
     * */
    @Override
    public void quickSort() {//4번
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    @Override
    public void mergeSort() {//5번
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
    }

    /**
     * 홀수 마방진
     * 1. 정사각형의 맨 아랫줄 가운데에 숫자 1 을 둔다.
     * 2. 이전 숫자 위치에서 오른쪽 아래칸이 비어 있으면 다음 숫자를 채운다.
     * 3. 이전 숫자 위치에서 오른쪽 아래칸이 채워져 있으면 이전 숫자의 위칸에 다음 숫자를 채운다.
     * 4. 오른쪽 아래칸이 사각형의 영역 밖이면 다음의 규칙을 따른다.
     * 4-1. 수평 및 수직으로 이동해서 마지막 칸이 비어 있으면 해당 칸에 숫자를 채운다.
     * 4-2. 수평 및 수직으로 이동해도 칸이 없는 경우 이전의 숫자 위치 위쪽 칸에 다음 숫자를 채운다.
     *
     * 짝수 마방진
     * 1. 대각선의 위치만 1 부터 시작해서 해당칸이 몇 번째 칸인지 숫자를 채운다.
     * 2. 맨 오른쪽 아래부터 위로 올라오면서 채워지지 않은 숫자를 순서대로 채운다.
     */
    @Override
    public void magicSquare(int num) {//6번
        int[] square = new int[num * num];
        int nextIndex;

        if (num % 2 == 1) {
            int index = square.length - (int) (num / 2) - 1;
            square[index] = 1;
            for (int i = 2; i <= square.length; i++) {
                if ((index / num == (num - 1)) &&
                        (index % num == (num - 1))) {
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

    public void oddmagicSquare(int num){

    }


    @Override
    public void zigzag() {//7번

    }

    @Override
    public void rectangleStarPrint() {//8번
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
    public void triangleStarPrint() {//9번
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
