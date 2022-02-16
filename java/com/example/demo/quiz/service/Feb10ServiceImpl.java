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


    public void bubbleSort() {//전종현
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {
            arr[i]= (int)(Math.random()*100)+1;  //랜덤함수를 이용해 1~100까지의 정수 중 10개를 뽑는다.
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    i--; break;  //숫자가 나오는 순서대로 중복되는 값이 있으면 그 자리에 다시 새로운 값이 들어오도록 한다.
                }
            }
        }
        int temp = 0;
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length-1; j++){ //1회전 후 가장 큰 수가 제일 뒤에 위치하면서 마지막 요소는 자연스럽게 정렬되므로 -1
                if(arr[j]>arr[j+1]){    //왼쪽값(j)이 오른쪽값(j+1)보다 크면
                    temp = arr[j];    //우선 temp에 arr[j] 값을 넣어두고
                    arr[j] = arr[j+1];  //비어있는 arr[j] 자리에 arr[j+1]값을 넣어준다.
                    arr[j+1] = temp;}    //마지막으로 temp에 있던 값을 비어있는 arr[j+1]자리에 넣어주면 두 숫자의 자리가 바뀐다.
            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    /**
     * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다.
     * 2. 첫 번째 타겟은 두 번째 원소부터 시작해 첫 번째 값과 비교한다.
     * 3. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
     * 4. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
     */


    @Override
    public void insertionSort() {//전종현
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++) {       //1~100까지의 정수 중 랜덤으로 10개 숫자 뽑기
            arr[i]= (int)(Math.random()*100)+1;
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    i--; break;
                }
            }
        }
        int temp = 0;
        int j = 0;
        for (int i=1; i<arr.length; i++) {  //0번은 정렬된 상태로 가정하고 1번 값부터 왼쪽에 있는 값들과 비교한다.
            temp = arr[i];  //현재 선택된 원소의 값을 temp 에 넣어준다.
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) { //j의 인덱스가 0이상이고 왼쪽값이 temp 값보다 크면 반복문을 실행한다.
                arr[j  + 1] = arr[j]; //조건에 부합하는 값을 만나면 그 값은 오른쪽으로 이동한다.
            } arr[j+1] = temp; //삽입할 자리를 찾으면 그곳에 temp 값을 넣어준다. 다시 위로 올라가 인덱스 2번 값부터 다시 반복한다.
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ "\t");
        }
    }

    /**
     * 1. 주어진 리스트에서 최솟값을 찾는다.
     * 2. 최솟값을 맨 앞 자리의 값과 교환한다.
     * 3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
     * */

    @Override
    public void selectionSort() {//전종현
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {    //1~100까지의 정수 중 랜덤으로 10개 숫자 뽑기
            arr[i]= (int)(Math.random()*100)+1;
            for (int j=0; j<i; j++) {
                if (arr[i]==arr[j]) {
                    i--; break;
                }
            }
        }

        int min = 0;
        for (int i=0; i<arr.length-1; i++) {  //1~9회전을 하면 마지막 요소는 자연스럽게 정렬 되므로 -1
            min = i;                             //우선 i를 최솟값 변수에 저장해둔다. -> arr[min]
            for (int j=i+1; j<arr.length; j++) {   //arr[i+1]번째 원소부터 arr[min] 값과 비교한다.
                if (arr[min] > arr[j]) {         //arr[min]의 값이 arr[j]의 값보다 크면 arr[min]은 j가 된다.
                    min = j;                      //반복해서 비교하며 최종 최솟값을 찾아낸다.
                }
            }
            int temp = 0;
            temp = arr[min];        //temp에 최솟값을 넣어주고,
            arr[min] = arr[i];      //비어있는 arr[min] 자리에 arr[i]에 있던 값을 넣어준다.
            arr[i] = temp;       //다시 비어있는 arr[i]로 temp에 있던 최솟값을 넣어준다.
        }                          //이제 인덱스0번 자리는 최솟값이 들어갔고, 인덱스1번부터 다시 반복한다.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    /*
     *  1인분
     * */


    @Override
    public void quickSort(int[] arr, int start, int end) { //실행안됨
        int part=partition(arr, start, end);
        if(start<part-1) {
            quickSort(arr,start,part-1);
        }
        if(end>part) {
            quickSort(arr,part,end);
        }
    }

    public int partition(int[] arr,int start,int end) {
        int pivot=arr[(start+end)/2];//중간 값 구하기
        while(start<=end) {
            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;
            if(start<=end) {
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }
    public void swap(int[] arr,int start,int end) {
        int tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
        return;
    }

    @Override
    public void mergeSort(int[] arr) { //실행안됨
        // 랜덤 정수 ( 1 ~ 100) 사이의 10 개 정수 정렬
        sort(arr, 0, arr.length);
    }
    public void sort(int[] arr, int low, int high) {
        if (high - low < 2) {
            return;
        }

        int mid = (low + high) / 2;//중앙값을 기준으로 2개그룹으로 분할
        sort(arr, 0, mid);
        sort(arr, mid, high);//정렬 후 병합
        merge(arr, low, mid, high);
    }
    //잘 모르겠습니다.
    public void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low];
        int t = 0, l = low, h = mid;

        while (l < mid && h < high) {
            if (arr[l] < arr[h]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[h++];
            }
        }
        while (l < mid) {
            temp[t++] = arr[l++];
        }
        while (h < high) {
            temp[t++] = arr[h++];
        }
        for (int i = low; i < high; i++) {
            arr[i] = temp[i - low];
        }
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
