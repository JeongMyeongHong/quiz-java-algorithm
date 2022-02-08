package com.example.demo.algorithm.service;

/**
 * packageName   :   com.example.demo.algorithm.service
 * fileName      :   StackService
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public interface StackService {
    /**
     * https://programmers.co.kr/learn/courses/30/parts/12081
     * */
    int[] devFunction(int[] progresses, int[] speeds);
    int printer(int[] priorities, int location);
    int crossTruck(int bridge_length, int weight, int[] truck_weights);
    int[] stockPrice(int[] prices);


}
