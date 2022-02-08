package com.example.demo;

import com.example.demo.algorithm.controller.AlgorithmController;
import com.example.demo.auth.controller.AuthController;
import com.example.demo.oop.controller.OopController;
import com.example.demo.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		AuthController authController = new AuthController();
		OopController oopController = new OopController();
		QuizController quizController = new QuizController();
		AlgorithmController algorithmController = new AlgorithmController();

		while (true){
			System.out.println("[MainMenu]\n0. Exit 1. Auth 2. OOP 3. Quiz 4. Algorithm");
			switch (scanner.next()){
				case "0":
					System.out.println("### Exit ###");
					return;
				case "1":
					System.out.println("### Auth ###");
					authController.excute(scanner);
					break;
				case "2":
					System.out.println("### OOP ###");
					oopController.excute(scanner);
					break;
				case "3":
					System.out.println("### Quiz ###");
					quizController.excute(scanner);
					break;
				case "4":
					System.out.println("### Algorithm ###");
					algorithmController.excute(scanner);
					break;
				default:
					System.out.println("Wrong Number");
			}
		}

	}
}
