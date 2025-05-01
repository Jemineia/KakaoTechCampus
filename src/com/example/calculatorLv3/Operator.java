package com.example.calculatorLv3;

public enum Operator {
    PLUS('+') {
        public double apply(Number a, Number b) {
            return a.doubleValue() + b.doubleValue(); // double로 변환하여 더함
        }
    },
    MINUS('-') {
        public double apply(Number a, Number b) {
            return a.doubleValue() - b.doubleValue();
        }
    },
    MULTIPLY('*') {
        public double apply(Number a, Number b) {
            return a.doubleValue() * b.doubleValue();
        }
    },
    DIVIDE('/') {
        public double apply(Number a, Number b) {
            if (b.doubleValue() == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
            return a.doubleValue() / b.doubleValue();
        }
    };

    private final char symbol;

    Operator(char symbol) {
        this.symbol = symbol;
    }

    // apply 메서드 변경 - int -> Number
    public abstract double apply(Number a, Number b);

    public static Operator fromChar(char input) {
        for (Operator op : values()) {
            if (op.symbol == input) return op;
        }
        return null;
    }
}
