public class Patient {
    //the constructor for this class will take three parameters: name, weight (in kg) and age of the patient and put them into private fields which can be accessed using getters (ie methods such as getAge, getWeight etc).
    private String name;
    private double weight;
    private int age;

    public Patient(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}

