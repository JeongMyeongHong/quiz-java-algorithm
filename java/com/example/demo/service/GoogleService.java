package com.example.demo.service;

import com.example.demo.domain.GoogleDTO;

/**
 * packageName   :   com.example.demo.google
 * fileName      :   GoogleDemo
 * author        :   JeongMyeongHong
 * date          :   2022-01-25
 * desc          :  GoogleApp을 실행하는 컨트롤러.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-25      JeongMyoengHong     최초 생성
 */
public class GoogleService {
    public String getgoogle(GoogleDTO google) {
        return String.format("검색된 결과는 %s 입니다.",google.getSearchedword());
    }
}
