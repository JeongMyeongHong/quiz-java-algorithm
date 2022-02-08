package com.example.demo.algorithm.controller;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.algorithm.controller
 * fileName      :   AlgorithmController
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public class AlgorithmController {
    public void excute(Scanner scanner){
        while (true){
            System.out.println("[서브메뉴]\n[담당] 0.종료 1.홍정명 2.노홍주 3.전종현 4.정경준 5.양정오");
            switch (scanner.next()){
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    System.out.println("[소메뉴]\n0.Exit 1.Stack 2.Queue 3.Dfs 4.Bfs");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("1.Stack");
                            break;
                        case "2":
                            System.out.println("2.Queue");
                            break;
                        case "3":
                            System.out.println("3.Dfs");
                            break;
                        case "4":
                            System.out.println("4.Bfs");
                            break;
                    }
                case "2":
                    System.out.println("[소메뉴]\n0.Exit 1.Sort 2.Heap");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("1.Sort");
                            break;
                        case "2":
                            System.out.println("2.Heap");
                            break;
                    }
                case "3":
                    System.out.println("[소메뉴]\n0.Exit 1.Hash 2.Greedy");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("1.Hash");
                            break;
                        case "2":
                            System.out.println("2.Greedy");
                            break;
                    }
                case "4":
                    System.out.println("[소메뉴]\n0.Exit 1.BruteForce 2.DP");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("1.BruteForce");
                            break;
                        case "2":
                            System.out.println("2.DP");
                            break;
                    }
                case "5":
                    System.out.println("[소메뉴]\n0.Exit 1.BinarySearch 2.Graph");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("1.BinarySearch");
                            break;
                        case "2":
                            System.out.println("2.Graph");
                            break;
                    }
            }
        }
    }
}
