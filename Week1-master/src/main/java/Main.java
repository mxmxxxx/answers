public class Main {
    public static void main(String[] args) {
        // Even though main is static and is the entry point, we can still instantiate an object of this class to call its non-static methods
        Main mainObject=new Main();
        mainObject.calculatorGo();
        mainObject.calculateDosages();
    }
    public void calculatorGo() {
        // Instantiate an object of class Calculator with initial value of zero
        Calculator calc=new Calculator(0); // This will call the constructor
        // Add some values
        calc.add(5.2);
        calc.add(1.75);

        calc.AC();
        int i;
        for(i=0;i<=10;i++){
            calc.add(i);
        }
        calc.AC();
        for(i=10;i>0;i=i-2){
            calc.add(i);
        }

        // a for loop to the code above that calculates the product of all odd numbers from 7 to 15 inclusive.
        calc.AC();
        for(i=7;i<=15;i=i+2){
            calc.multiply(i);
        }
        //a for loop to the code above that calculates the sum of all even numbers from 2 to 100 inclusive that aren’t multiples of 6.
        calc.AC();
        for(i=2;i<=100;i=i+2){
            if(i%6!=0){
                calc.add(i);
            }
        }
    }

    public void calculateDosages(){
        // There are three patients:-
        // John Barking: age 60 weight 65kg
        // Samantha Olives: age 70 weight 65kg
        // Paul Ball: age 45 weight 90kg
        // Who are each on two drugs:-
        // Paracetamol: dosage 10 mg/kg
        // Benadryl: dosage 5mg/kg
        Patient pat1=new Patient("John Barking",65,60);
        Patient pat2=new Patient("Samantha Olives",65,70);
        Patient pat3=new Patient("Paul Ball",90,45);
        Drug drug1=new Drug("Paracetamol",10);
        Drug drug2=new Drug("Benadryl",5);
        DrugDosageCalculator calc=new DrugDosageCalculator();
        System.out.println("Dosage for "+pat1.getName()+" on "+drug1.getName()+" is "+calc.calculateDosage(pat1,drug1)+"mg");
        System.out.println("Dosage for "+pat1.getName()+" on "+drug2.getName()+" is "+calc.calculateDosage(pat1,drug2)+"mg");
        System.out.println("Dosage for "+pat2.getName()+" on "+drug1.getName()+" is "+calc.calculateDosage(pat2,drug1)+"mg");
        System.out.println("Dosage for "+pat2.getName()+" on "+drug2.getName()+" is "+calc.calculateDosage(pat2,drug2)+"mg");
        System.out.println("Dosage for "+pat3.getName()+" on "+drug1.getName()+" is "+calc.calculateDosage(pat3,drug1)+"mg");
        System.out.println("Dosage for "+pat3.getName()+" on "+drug2.getName()+" is "+calc.calculateDosage(pat3,drug2)+"mg");


    }
}
