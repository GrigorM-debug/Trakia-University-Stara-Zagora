public class Worker extends Human{
    public int workingHours;
    public Worker(String firstName, String lastName){
        super(firstName, lastName);
        this.workingHours = 8;
    }
    @Override
    int calculateDailyWage() {
        int hourlyRate = 10;
        return this.workingHours * hourlyRate;
    }
}
