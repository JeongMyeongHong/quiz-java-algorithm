package com.example.demo.algorithm.service;

/**
 * packageName   :   com.example.demo.algorithm.service
 * fileName      :   GraphService
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public interface GraphService {
    int node(int n, int[][] edge);
    int ranking(int n, int[][] results);
    int rooms(int[] arrows);
}
