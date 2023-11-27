public class Drug {
    // the constructor for this class will take drug name, and dosage per unit patient weight (in mg/kg) and do similar to Patient.
    private String name;
    private double dosage;
    public Drug(String name, double dosage) {
        this.name = name;
        this.dosage = dosage;
    }

    public String getName() {
        return name;
    }

    public double getDosage() {
        return dosage;
    }
}
