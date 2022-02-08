package com.example.demo.auth.domain;

/**
 * packageName   :   com.example.demo.grade
 * fileName      :   GradeApp
 * author        :   JeongMyeongHong
 * date          :   2022-01-26
 * desc          :
 * 사용자로부터
 * 이름 [          ]
 * 국어 [          ]
 * 영어 [          ]
 * 수학 [          ]
 * 을 차례대로 입력 받아서
 * ########## 성적표 ########
 * 이름: 홍길동
 * > 국어: 80점
 * > 영어: 79점
 * > 수학: 80점
 * 총점: 239점
 * 평균(정수): 79점
 * 합격여부: 합격(불합격)
 * #######################
 * 출력되는 프로그램을 작성
 * 단, 합격 / 불합격 기준은
 * 평균 60점 이상이면 합격
 * <p>
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-26      JeongMyoengHong     최초 생성
 */
public class GradeDTO {
    public static String GRADE_TITLE = "성적표";
    private String name;
    private int kr;
    private int en;
    private int math;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKr() {
        return kr;
    }

    public void setKr(int kr) {
        this.kr = kr;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
