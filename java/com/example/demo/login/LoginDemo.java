package com.example.demo.login;

import java.util.Scanner;

public class LoginDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();

        System.out.println(LoginApp.LOGIN_TITLE);
        System.out.println("id를 입력해주세요.");
        System.out.println("pw를 입력해주세요.");
        System.out.println("이름을 입력해주세요.");

        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();

        System.out.println(loginApp.login(id, pw, name));
    }
}
