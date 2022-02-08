package com.example.demo.algorithm.service;

/**
 * packageName   :   com.example.demo.algorithm.service
 * fileName      :   GreedyService
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public interface GreedyService {
    int trainingLook(int n, int[] lost, int[] reserve);
    int joyStick(String name);
    String makeBigNumber(String number, int k);
    int lifeBoat(int[] people, int limit);
    int connectIsland(int n, int[][] costs);
    int camera(int[][] routes);
}
