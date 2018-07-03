class CalculatorTest{
    public static void main(String[] args) {
        Calculator first = new Calculator();
        first.performOperation(10.5);
        first.performOperation("+");
        first.performOperation(5.2);
        first.performOperation("*");
        first.performOperation(10.0);
        first.performOperation("=");
        first.getResult();
    }
}