class CalculatorTest {
    public static void main(String[] args) {
        Calculator add = new Calculator();
        add.setOperandOne(4.0);
        add.setOperandTwo(3.9);
        add.performOperation();
        Calculator add2 = new Calculator();
        add2.setOperandOne(12312.3);
        add2.setOperandTwo(7.7);
        add2.setOperation("+");
        add2.performOperation();
        add2.getResults();
        Calculator sub = new Calculator();
        sub.setOperandOne(4.1);
        sub.setOperation("-");
        sub.setOperandTwo(3.1);
        sub.performOperation();
        sub.getResults();
    }
}