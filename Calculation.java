class Calculation{
    private double number1;
    private double number2;
    private char operation;
    private double result;

    public Calculation(double inputNumber1, double inputNumber2, char inputOp){
        number1 = inputNumber1;
        number2 = inputNumber2;
        operation = inputOp;
        result = null;

        switch(operation){
            case('+'):
                addition();
                break;
            
            case('-'):
                subtraction();
                break;
            
            case('*'):
                multiply();
                break;

            case('/'):
                divide();
                break;
        }
    }

    public double getResult(){
        return result;
    }

    public void addition(){
        result = number1 + number2;
    }

    public double subtraction(){
        result = number1 - number2;
    }

    public double multiply(){
        result = number1 * number2;
    }

    public double divide(){
        result = number1 / number2;
    }

    public String toString(){
        return "" + number1  + " " + operation + " " + number2 + " = " + result;
    }
}