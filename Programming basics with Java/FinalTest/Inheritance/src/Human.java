public abstract class Human {

    private String firstName;
    private String lastName;
    private int workingHours = 0;

    public Human(String firstName) {
        this.firstName = firstName;
    }

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    abstract int calculateDailyWage();

    public int calculateSalary() {
        return 22 * calculateDailyWage();
    }
}
