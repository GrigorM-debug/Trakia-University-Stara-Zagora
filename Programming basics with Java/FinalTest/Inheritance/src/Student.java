public class Student extends Human{
    public int facultyNumber;
    public int workingHours;

    public Student(String firstName, String lastName, int facultyNumber) {
        super(firstName, lastName);
        this.facultyNumber = facultyNumber;
        this.workingHours = 4;
    }


    public boolean equals(Student student){
        return this.facultyNumber == student.facultyNumber;
    }
    @Override
    int calculateDailyWage() {
        int hourlyRate = 10;
        return this.workingHours * hourlyRate;
    }
}
