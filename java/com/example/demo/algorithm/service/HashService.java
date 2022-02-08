package com.example.demo.algorithm.service;

/**
 * packageName   :   com.example.demo.algorithm.service
 * fileName      :   HashService
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public interface HashService {
    String failedPlayer(String[] participant, String[] completion);
    boolean phoneBook(String[] phone_book);
    int spy(String[][] clothes);
    int[] bestAlbum(String[] genres, int[] plays);
}
