package com.example.demo.auth.domain;

/**
 * packageName   :   com.example.demo.google
 * fileName      :   GoogleApp
 * author        :   JeongMyeongHong
 * date          :   2022-01-25
 * desc          :  검색한 결과를 받아서 출력하는 앱.
 * variable      :   [클래스변수] :  GOOGLETITLE
 *                   [인스턴스변수]: searchedword
 *                   [파라미터] :   searchedword
 *                   [로컬변수] :   res
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-25      JeongMyoengHong     최초 생성
 */
public class GoogleDTO {
    public static String GOOGLETITLE = "GOOGLE";

    private final static GoogleDTO googleDTO = new GoogleDTO();

    private GoogleDTO(){}

    public static GoogleDTO googleDTO(){
        return googleDTO;
    }

    private String searchedword;



    public String getSearchedword(){
        return searchedword;
    }
    public void setSearchedword(String searchedword){
        this.searchedword = searchedword;
    }
}
