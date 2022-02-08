package com.example.demo.algorithm.service;

/**
 * packageName   :   com.example.demo.algorithm.service
 * fileName      :   DfsServiceImpl
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public class DfsServiceImpl implements DfsService{
    @Override
    public int fact(int n) {
        if (n <= 1)
            return n;
        else
            return fact(n-1) * n;
    }

    @Override
    public int targetNumber(int[] numbers, int target) {
        int cnt = (numbers.length - (target/numbers[0]))/2;
        int answer = fact(numbers.length)/(fact(cnt)*(fact(numbers.length-cnt)));
        return answer;
    }

    @Override
    public int network(int n, int[][] computers) {
        int answer = 0;
        return answer;
    }

    @Override
    public int transWord(String begin, String target, String[] words) {
        int answer = 0;
        return answer;
    }

    @Override
    public String[] travelRoute(String[][] tickets) {
        String[] answer = {};
        return answer;
    }
}
