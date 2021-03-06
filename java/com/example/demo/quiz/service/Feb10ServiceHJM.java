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
 * -                 -            8번 9번 완료.
 * 2022-02-11            -            6번 홀수 완료.
 */
public class Feb10ServiceHJM implements Feb10Service {
    /*
     *  1인분
     * */
    public int[] creatArr() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        printArr(arr);
        System.out.println("정렬 전");
        return arr;
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * author        :   JeongmyeongHong
     * desc          :
     * (BubbleSort)인접한 두개의 숫자를 비교하여 더 큰 숫자를 뒤로 보내는 방식의 정렬.
     * 정렬 실행 시 뒤쪽부터 정렬이 완료된다.
     */
    @Override
    public void bubbleSort() {//1번
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        int[] arr = creatArr();

        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println("정렬 후");
        printArr(arr);
    }

    /**
     * author        :   JeongmyeongHong
     * desc          :   (InsertionSort) 이미 정렬된 배열에서 현재 인덱스의 값이 위치할 곳에 삽입되는 정렬.
     */

    @Override
    public void insertionSort() {//2번
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        int[] arr = creatArr();
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    for (int k = i; k > j; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[j] = tmp;
                    break;
                }
            }
            printArr(arr);
        }
        System.out.println("정렬 후");
        printArr(arr);
    }


    /**
     * author        :   JeongmyeongHong
     * desc          :
     * (SelectionSort)주어진 리스트 중에 최소값을 찾는다.
     * 그 값을 맨 앞에 위치한 값과 교체한다.
     * 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
     */
    @Override
    public void selectionSort() {//3번
        int[] arr = creatArr();
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) minIndex = j;
                if (j == arr.length - 1) {
                    int tmp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = tmp;
                }
            }
        }
        System.out.println("정렬 후");
        printArr(arr);
    }

    /**
     * author        :   JeongmyeongHong
     * desc          :
     * (QuickSort)임의의 원소를 피벗으로 정한다.
     * 피벗보다 작은 원소는 좌측으로(오름차순의 경우), 큰 원소는 우측으로 오도록 분할한다.
     * (분할 후 피벗의 인덱스는 변하지 않는다.)
     */
    @Override
    public void quickSort() {
        int[] arr = creatArr();

        quick(arr, 0, arr.length - 1);

        printArr(arr);
    }

    public void quick(int[] arr, int left, int right) {
        if (left < right) {
            int leftIndex = left - 1;
            for (int j = left; j <= right - 1; j++) {
                if (arr[j] <= arr[right]) {
                    leftIndex++;
                    int tmp = arr[j];
                    arr[j] = arr[leftIndex];
                    arr[leftIndex] = tmp;
                }
            }
            int tmp = arr[leftIndex + 1];
            arr[leftIndex + 1] = arr[right];
            arr[right] = tmp;

            int pivot = leftIndex + 1;

            quick(arr, left, pivot - 1);
            quick(arr, pivot + 1, right);
        }
    }


    @Override
    public void mergeSort() {
        int[] arr = creatArr();

        merge(arr, 0, arr.length - 1);

        System.out.println("소트 실행 후");
        printArr(arr);
    }


    public void merge(int[] arr, int left, int right) {
        int[] tmp = new int[arr.length];
        if (left < right) {
            int mid = (left + right) / 2;


            //분할하는 과정.
            merge(arr, left, mid);
            merge(arr, mid + 1, right);


            //left는 분할시의 인덱스,
            // leftIndex는 병합시의 인덱스. leftIndex는 병합시 계속 ++해주므로 병합용 인덱스 할당.
            // midIndex도 leftIndex와 같은 이유.
            // right는 병합시 변하지 않기때문에 굳이 병합용 인덱스를 할당 해 줄 필요가 없다.

            int leftIndex = left;
            int midIndex = mid + 1;
            int idx = leftIndex;//tmp에서 사용할 인덱스
            while (leftIndex <= mid || midIndex <= right) {
                if (midIndex > right || //우측이 먼저 끝난경우 or 좌측값이 더 작은경우
                        (leftIndex <= mid && arr[leftIndex] < arr[midIndex])) {
                    tmp[idx] = arr[leftIndex];
                    leftIndex++;
                } else {    //좌측이 먼저 끝난 경우 or 우측 값이 더 작은 경우.
                    tmp[idx] = arr[midIndex];
                    midIndex++;
                }
                idx++;
            }
            for (int i = left; i <= right; i++) {
                arr[i] = tmp[i];
            }
            printArr(arr);
        }
    }

    /**
     * 홀수 마방진
     * 1. 정사각형의 맨 아랫줄 가운데에 숫자 1 을 둔다.
     * 2. 이전 숫자 위치에서 오른쪽 아래칸이 비어 있으면 다음 숫자를 채운다.
     * 3. 이전 숫자 위치에서 오른쪽 아래칸이 채워져 있으면 이전 숫자의 위칸에 다음 숫자를 채운다.
     * 4. 오른쪽 아래칸이 사각형의 영역 밖이면 다음의 규칙을 따른다.
     * 4-1. 수평 및 수직으로 이동해서 마지막 칸이 비어 있으면 해당 칸에 숫자를 채운다.
     * 4-2. 수평 및 수직으로 이동해도 칸이 없는 경우 이전의 숫자 위치 위쪽 칸에 다음 숫자를 채운다.
     * <p>
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


    @Override
    public void zigzag() {//7번
        int num = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i % 2 == 0) {
                    System.out.print(i * num + j + "\t");
                } else {
                    System.out.print(i * num + num - j - 1 + "\t");
                }
            }
            System.out.println();
        }
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
