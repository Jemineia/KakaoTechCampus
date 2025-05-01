package com.example.calculatorLv2;
import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("[Hello, Calculator!]");
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
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

            int result = calculator.calc(a,op,b);
            System.out.println("계산결과: " + result);
            System.out.println("계산을 지속하시겠습니까?");
            answer = sc.next();

        }while(!answer.equals("exit"));
        System.out.println("[계산기를 종료합니다]");

        //getter시험
        List<Integer> results = calculator.getResults();
        System.out.println("지금까지 계산한 값" + results);

        //setter 시험
        System.out.println("수정할 index와 값 입력");
        int index = sc.nextInt();
        int value = sc.nextInt();

        calculator.setResult(index, value);
        System.out.println("수정 후");
        calculator.printResults();

        //맨 먼저 계산된 값 지우기
        System.out.println("가장 먼저 계산된값 지우기");
        calculator.eraseFirst();
        calculator.printResults();
    }
}
