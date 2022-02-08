package com.example.demo.auth.service;

import com.example.demo.auth.domain.*;

/**
 * packageName   :   com.example.demo.service
 * fileName      :   StudentService
 * author        :   JeongMyeongHong
 * date          :   2022-02-07
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-07      JeongMyoengHong     최초 생성
 */
public interface MemberService {
    String getBmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String search(GoogleDTO google);
    String getGrade(GradeDTO[] grades);
    String login(LoginDTO login);
}
