public class Calculator {
    private double rTotal; // The running total field

    // Constructor – called when an object of this class is instantiated
    public Calculator(double initVal){
        rTotal=initVal; // Set the initial value of rTotal to that passed in
    }
    private void showRT(){  // Display rTotal to the screen
        System.out.println("Result="+rTotal);
    }
    public double add(double val){ // A method to add a value
        rTotal=rTotal+val;
        showRT();
        return rTotal;
    }
    public double subtract(double val){ // A method to subtract a value
        rTotal=rTotal-val;
        showRT();
        return rTotal;
    }
    public double multiply(double val){ // A method to multiply by a value
        rTotal=rTotal*val;
        showRT();
        return rTotal;
    }
    public double divide(double val){ // A method to divide by a value
        rTotal=rTotal/val;
        showRT();
        return rTotal;
    }
    public double squareroot(){ // A method to find the square root
        rTotal=Math.sqrt(rTotal);
        showRT();
        return rTotal;
    }
    public void AC(){ // All clear. Does not return a value, so return type is ‘void’
        rTotal=0;
        System.out.println("Cleared");
    }

}
