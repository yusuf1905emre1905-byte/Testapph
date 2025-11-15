package com.example.testapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "Soru 1: 2 + 2 = ?\n(a) 3\n(b) 4\n(c) 5",
            "Soru 2: Java hangi yılda ortaya çıktı?\n(a) 1995\n(b) 1990\n(c) 2000",
            "Soru 3: Dünya kaç gezegene sahiptir?\n(a) 7\n(b) 8\n(c) 9"
        };
        char[] answers = {'b', 'a', 'b'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Cevabınız: ");
            char userAnswer = scanner.nextLine().toLowerCase().charAt(0);
            if (userAnswer == answers[i]) {
                score++;
                System.out.println("Doğru!\n");
            } else {
                System.out.println("Yanlış! Doğru cevap: " + answers[i] + "\n");
            }
        }

        System.out.println("Test tamamlandı! Toplam doğru cevap: " + score + "/" + questions.length);
        scanner.close();
    }
}
