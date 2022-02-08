package com.example.demo.quiz.service;


import com.example.demo.quiz.domain.TeamDTO;

/**
 * packageName   :   com.bitcamp.algorithm.service
 * fileName      :   QuizServiceImpl
 * author        :   JeongMyeongHong
 * date          :   2022-02-07
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-07      JeongMyoengHong     최초 생성
 */
public class Feb06ServiceImpl implements Feb06Service {
    @Override
    public void quiz1(TeamDTO team) {
        String s = "";
        System.out.println("Q1. 팀별 과제를 출력하세요");
        for (int i = 0; i < team.getArr().length; i++) {
            if (team.getArr()[i] != null) {
                s += String.format("%s \t", team.getArr()[i]);
            }
            if (i % 5 == 4) {
                s += "\n";
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz2(TeamDTO team) {
        String s = "";
    /*
    Q2. 팀장이 맡은 과제만 출력하세요
    홍정명, DFS, BFS, Stack, Queue
     */
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요");
        s = "";
        String leader = "홍정명";
        for (int i = 0; i < team.getArr().length; i++) {
            if (team.getArr()[i].equals(leader)) {
                for (int j = i; j < team.getArr().length; j += 5) {
                    if (team.getArr()[j] != "") {
                        s += team.getArr()[j] + ",";
                    }
                }
            }
        }
        System.out.println(s + "\n");

    }

    @Override
    public void quiz3(TeamDTO team) {
    /*
    Q3. 큐를 담당한 사람을 출력하세요
    큐를 담당한 사람 : 홍정명
     */
        String s = "";
        String subject = "Queue";
        System.out.printf("Q3. %s를 담당한 사람을 출력하세요\n", subject);
        for (int i = 0; i < team.getArr().length; i++) {
            if (team.getArr()[i].equals(subject)) {
                s = String.format("%s를 담당한 사람 : %s", subject, team.getArr()[i % 5]);
            }
        }
        System.out.println(s + "\n");

    }

    @Override
    public void quiz4(TeamDTO team) {
        String s;
    /*
    Q4. 팀원별 과제 수를 출력하세요.
    홍정명(4개), 노홍주(2개), 양정오(2개), 전종현(2개), 정경준(2개),
     */
        System.out.println("Q4 팀원별 과제 수를 출력하세요");
        int[] cnt = new int[5];
        s = "";

        for (int i = 0; i < team.getArr().length; i++) {
            if (team.getArr()[i] != "") {
                switch (i % 5) {
                    case 0:
                        cnt[0]++;
                        break;
                    case 1:
                        cnt[1]++;
                        break;
                    case 2:
                        cnt[2]++;
                        break;
                    case 3:
                        cnt[3]++;
                        break;
                    case 4:
                        cnt[4]++;
                        break;
                    default:
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            s += String.format("%s(%s개) ", team.getArr()[i], cnt[i] - 1);
        }
        System.out.println(s);
    }

    @Override
    public void quiz5(TeamDTO team) {
        String s;
    /*Q4_2. 팀원별 과제 수를 출력하세요.
    홍정명(4개), 노홍주(2개), 양정오(2개), 전종현(2개), 정경준(2개),
     */
        System.out.println("Q4_2 팀원별 과제 수를 출력하세요");
        int[] cnt2 = new int[5];
        s = "";

        for (int i = 0; i < cnt2.length; i++) {
            for (int j = cnt2.length; j < team.getArr().length; j++) {
                if (team.getArr()[j] != "") {
                    if (j % cnt2.length == i) {
                        cnt2[i]++;
                    }
                }
            }
            s += String.format("%s(%s개) ", team.getArr()[i], cnt2[i]);
        }
        System.out.println(s);
    }

    public void quiz6(TeamDTO team) {
        int[] intArr = new int[5];
        String[] arr = new String[2498];
        String s = "";

        for (int i = intArr.length; i < arr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                if (i % intArr.length == j) {
                    intArr[j]++;
                }
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            s += String.format("%s 번 열 (%s개) ", i, intArr[i]);
        }
        System.out.println(s);

    }
}


