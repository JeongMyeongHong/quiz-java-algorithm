package com.example.demo.service;

import com.example.demo.domain.GradeDTO;

/**
 * packageName   :   com.example.demo.grade
 * fileName      :   GradeDemo
 * author        :   JeongMyeongHong
 * date          :   2022-01-26
 * desc          :  GradeApp을 실행하는 컨트롤러.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-26      JeongMyoengHong     최초 생성
 */
public class GradeService {

    public String getgrade(GradeDTO[] grades) {
        String[] res = new String[grades.length];
        String results = "";
        for (int i = 0; i < grades.length; i++) {
            res[i] = String.format(" * ########## %s ########\n" +
                            " * 이름: %s\n" +
                            " * > 국어: %d점 \n" +
                            " * > 영어: %d점 \n" +
                            " * > 수학: %d점\n" +
                            " * 총점: %d점 \n" +
                            " * 평균(정수): %d점\n" +
                            " * 합격여부: %s\n" +
                            " * #######################",
                    GradeDTO.GRADE_TITLE, grades[i].getName(), grades[i].getKr(), grades[i].getEn(), grades[i].getMath(),
                    getTotal(grades[i]), getAvg(grades[i]), (getAvg(grades[i]) >= 60) ? "합격" : "불합격");
            results = results + "\n" + res[i];
        }

        return results;
    }

    private int getTotal(GradeDTO grades) {
        return grades.getKr() + grades.getEn() + grades.getMath();
    }

    private int getAvg(GradeDTO grades) {
        return (grades.getKr() + grades.getEn() + grades.getMath()) / 3;
    }

}
