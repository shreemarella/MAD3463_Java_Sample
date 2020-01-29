import java.time.LocalDate;

public class StudentMainClass {

    public static void main(String[] args) {
        Student kashyap = new Student(1,"Shree","Marella", Student.Gender.male, LocalDate.of(1998,05,29
        ),new Float[]{50.0f,80.0f,40f,70f,60f});
        kashyap.printData();
    }
}