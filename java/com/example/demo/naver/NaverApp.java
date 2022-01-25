package com.example.demo.naver;

/**
 * packageName   :   com.example.demo.naver
 * fileName      :   NaverApp
 * author        :   JeongMyeongHong
 * date          :   2022-01-25
 * desc          :   id, pw, 로그인유지여부를 받고 id만을 출력하는 앱.
 * variable      :   [클래스변수] :  NAVERTITLE
 *                   [인스턴스변수]: id, pw, logcons
 *                   [파라미터] :   searchedword
 *                   [로컬변수] :   res
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-25      JeongMyoengHong     최초 생성
 */
public class NaverApp {
    public static String NAVERTITLE = "====NAVER====";
    private String id;
    private String pw;
    private int logcons;

    public String login(String id, String pw, int logcons){
        this.id = id;
        this.pw = pw;
        this.logcons = logcons;

        String res = "%s님 로그인 하셨습니다.";
        return String.format(res,this.id);
    }

}
