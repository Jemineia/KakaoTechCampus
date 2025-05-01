package com.example.calculatorLv2;
import java.util.*;
public class Calculator {
    private List<Integer> results = new ArrayList<>();
    int calc(int a, char op, int b){
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
        results.add(result);
        return result;
    }
    public List<Integer> getResults(){
        return new ArrayList<>(results);
    }
    public void setResult(int index, int value) {
        results.set(index, value);
    }
    public void printResults() {
        System.out.println("현재 결과 리스트: " + results);
    }
    public void eraseFirst(){
        results.remove(0);
    }
}
