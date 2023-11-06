// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John", "Doe", 23);
        int student1DailyWage = student1.calculateDailyWage();

        Worker worker1 = new Worker("Jane", "Smith");
        int worker1DailyWage = worker1.calculateDailyWage();

        System.out.println("Student: " + student1.getFirstName()+ " " + student1.getLastName());
        System.out.println("Faculty Number: " + student1.facultyNumber);
        System.out.println("Daily Wage: $" + student1DailyWage);

        System.out.println();

        System.out.println("Worker: " + worker1.getFirstName() + " " + worker1.getLastName());
        System.out.println("Daily Wage: $" + worker1DailyWage);
    }
}