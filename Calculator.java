import java.util.ArrayList;

class Calculator{
    private ArrayList<Calculation> calHis;

    public Calculator(){
        calHis = new ArrayList<Calculation>();

        CalUI display = new CalUI();
    } 

    public void compute(double inputNumber1, double inputNumber2, char inputOp){
        Calculation newCalc = new Calculation(inputNumber1, inputNumber2, inputOp);

        calHis.add(newCalc);
    }


}