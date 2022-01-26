package com.example.demo.grade2;

/**
 * packageName   :   com.example.demo.grade2
 * fileName      :   GradeApp2
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
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-26      JeongMyoengHong     최초 생성
 */
public class GradeApp2 {
    public static String GRADE_TITLE = "성적표";
    private String name;
    private int score_kr;
    private int score_en;
    private int score_math;
    private int total;
    private int avg;

    public void setgrade(String name, int score_kr, int score_en, int score_math){
        this.name = name;
        this.score_kr = score_kr;
        this.score_en = score_en;
        this.score_math = score_math;
        this.total = score_kr + score_en + score_math;
        this.avg = this.total/3;

    }
    String getName(){
        return name;
    }
    int getscore_kr(){
        return score_kr;
    }
    int getscore_en(){
        return score_en;
    }
    int getscore_math(){
        return score_math;
    }
    int gettotal(){
        return total;
    }
    int getavg(){
        return avg;
    }
    String getgrade(){
        return (avg >= 60) ? "합격"
                : "불합격";
    }

}
