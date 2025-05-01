package com.example.calculatorLv1;

import java.util.Scanner;

public class Calculator {
    static int calc(int a, char op, int b){
        int result = 0;
        switch (op){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("[Hello, Calculator!]");

        Scanner sc = new Scanner(System.in);
        String answer;
        do{
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int b = sc.nextInt();

            //System.out.println("a:"+a+ "|b :"+b);

            System.out.print("사칙연산 기호를 입력하세요: ");
            char op = sc.next().charAt(0);

            int result = calc(a,op,b);
            System.out.println("계산결과: " + result);
            System.out.println("계산을 지속하시겠습니까?");
            answer = sc.next();

        }while(!answer.equals("exit"));
        sc.close();
        System.out.println("[계산기를 종료합니다]");
    }
}