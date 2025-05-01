package com.example.calculatorLv3;
import java.util.*;
public class Calculator {

    //이전에 계산했던 값들 저장(private로 외부접근방지)
    private List<Number> results = new ArrayList<>();
    public double calc(Number a, Operator op, Number b) {
        double result = op.apply(a, b);
        results.add(result);
        return result;
    }
    //getter
    public List<Number> getResults(){
        return new ArrayList<>(results);
    }
    //setter
    public void setResults(int index, Number value){
        results.set(index, value);
    }
    public void eraseFirst(){
        results.remove(0);
    }
    public void printResults() {
        System.out.println("현재 결과 리스트: " + results);
    }
    public void GreaterThanValues(Number threshold) {
        System.out.println(threshold + "보다 큰 연산 결과들");
        results.stream()
                .map(Number::doubleValue)
                .filter(value -> value > threshold.doubleValue())
                .forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

}
