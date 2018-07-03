class Calculator {
    Double oper1;
    Double oper2;
    String oper;
    Double result;
    public Calculator (){
        this.oper1 = null;
        this.oper = "";
        this.oper2 = null;
    }
    public Calculator(Double oper1, String oper, Double oper2){
        this.oper1 = oper1;
        this.oper2 = oper2;
        this.oper = oper;

    }
    public void setOperandOne(Double oper1){
        this.oper1 = oper1;
    }
    public void setOperation(String oper){
        this.oper = oper;
    }
    public void setOperandTwo(Double oper2){
        this.oper2 = oper2;
    }
    public void performOperation(){
        if (this.oper !="" && this.oper1 !=null && this.oper2 != null){
            switch(this.oper){
                case "+": this.result = this.oper1 + this.oper2; break;
                case "-": this.result = this.oper1 - this.oper2; break;
                default: System.out.println("Invalid operator."); break;
            }
        }
        else {
            System.out.println("Not all fields have been set.");
        }
    }
    public Double getResults() {
        System.out.println(this.result);
        return this.result;
    }
}