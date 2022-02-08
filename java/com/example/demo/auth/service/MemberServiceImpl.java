package com.example.demo.auth.service;

import com.example.demo.auth.domain.*;

/**
 * packageName   :   com.example.demo.service
 * fileName      :   StudentServiceImpl
 * author        :   JeongMyeongHong
 * date          :   2022-02-07
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-07      JeongMyoengHong     최초 생성
 */
public class MemberServiceImpl implements MemberService {
    /**
     * BMI = w / (t * t)
     * 고도 비만 : 35 이상
     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
     * 경도 비만 (1단계 비만) : 25 - 29.9
     * 과체중 : 23 - 24.9
     * 정상 : 18.5 - 22.9
     * 저체중 : 18.5 미만
     */
    @Override
    public String getBmi(BmiDTO bmi) {
        double i = bmi.getWeight() * 10000 / bmi.getHeight() / bmi.getHeight();

        if (i >= 35) {
            return String.format("고도비만");
        } else if (i > 30) {
            return String.format("중(重)도 비만 (2단계 비만)");
        } else if (i > 25) {
            return String.format("경도 비만 (1단계 비만)");
        } else if (i > 23) {
            return String.format("과체중");
        } else if (i > 18.5) {
            return String.format("정상");
        } else {
            return String.format("저체중");
        }
    }

    @Override
    public String calc(CalcDTO calc) {
        switch (calc.getOpcode()) {
            case "+":
                return (String.format("연산 결과는 %d 입니다.", calc.getNum1() + calc.getNum2()));
            case "-":
                return (String.format("연산 결과는 %d 입니다.", calc.getNum1() - calc.getNum2()));
            case "*":
                return (String.format("연산 결과는 %d 입니다.", calc.getNum1() * calc.getNum2()));
            case "/":
                return (String.format("연산 결과는 %d 입니다.", calc.getNum1() / calc.getNum2()));
            default:
                return "잘못된 연산자 입니다.";
        }
    }

    @Override
    public String search(GoogleDTO google) {
        return String.format("검색된 결과는 %s 입니다.", google.getSearchedword());
    }

    @Override
    public String getGrade(GradeDTO[] grades) {
        String[] res = new String[grades.length];
        String results = "";
        for (int i = 0; i < grades.length; i++) {
            int total = grades[i].getKr() + grades[i].getEn() + grades[i].getMath();
            int avg = total / 3;
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
                    total, avg, (avg >= 60) ? "합격" : "불합격");
            results = results + "\n" + res[i];
        }
        return results;
    }

    @Override
    public String login(LoginDTO login) {
        return login.getPw().equals(LoginDTO.PASSWORD) ?
                String.format("%s님의 비번 %s가 맞습니다. 로그인 성공", login.getName(), login.getPw())
                : String.format("%s의 ID는 맞고, 비번 %s (이)가 틀립니다. 로그인 실패", login.getId(), login.getPw());
    }
}
