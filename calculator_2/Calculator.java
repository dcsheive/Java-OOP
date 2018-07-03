import java.util.ArrayList;
class Calculator {
    ArrayList<String> opers = new ArrayList<String>();
    ArrayList<Double> nums = new ArrayList<Double>();
    Double result;
    public Calculator (){

    }
    public void performOperation(Double dub){
        nums.add(dub);
    }
    public void performOperation(String str){
        if (str != "="){
            opers.add(str);
        }
        else {
            Double start = nums.get(nums.size()-1);
            for(int i = opers.size()-1; i >=0; i--){
                switch(opers.get(i)){
                    case "+": start = start + nums.get(i); break;
                    case "-": start = start - nums.get(i); break;
                    case "*": start = start * nums.get(i); break;
                    case "/": start = start / nums.get(i); break;
                    default: System.out.println("Invalid operator."); break;
                }
            }
            this.result = start;
        }
    }
    public void getResult(){
        System.out.println(this.result);
    }
}