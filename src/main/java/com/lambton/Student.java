import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    enum Gender{
        male,
        female,
    }

    enum Result{
        pass,
        fail,
    }

    private int studentId;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private int ageInYear;
    private float subjectMarks[]= new float[5];
    private float totalMarks;
    private float percentage;
    private Result result;

    public Student(){}   //Default Constructor

    public Student(int studentId, String firstName, String lastName, Gender gender, LocalDate birthDate,Float subjectMarks[]) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.subjectMarks[0]=subjectMarks[0];
        this.subjectMarks[1]=subjectMarks[1];
        this.subjectMarks[2]=subjectMarks[2];
        this.subjectMarks[3]=subjectMarks[3];
        this.subjectMarks[4]=subjectMarks[4];
        calculateAge();
        calculateTotalMarks();
    }

    public int getStudentId() {
        return studentId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        calculateAge();
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public int getAgeInYear() {
        return ageInYear;
    }

    public float[] getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(float[] subjectMarks) {
        this.subjectMarks = subjectMarks;
        calculateTotalMarks();
    }

    public float getPercentage() {
        return percentage;
    }


    public Result getResult() {
        return result;
    }


    private void calculateAge()
    {
        int age;
        LocalDate today=LocalDate.now();
        age=today.getYear()-birthDate.getYear();
        this.ageInYear=age;
    }

    private void calculateTotalMarks()
    {
        float total=0.0f;
        for (float mark:subjectMarks)
        {
            total+=mark;
        }
        this.totalMarks=total;
        calculatePercentage();
    }
    private void calculatePercentage()
    {
        float per=0.0f;
        per=this.totalMarks/subjectMarks.length;
        this.percentage=per;
        calculateResult();
    }

    private void calculateResult()
    {
        this.result = this.percentage>= 50.0 ? Result.pass : Result.fail;
    }

    private String getFormattedBirthDate() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd MMM, yyyy");

        String formattedDate = this.birthDate.format(myFormatObj);
        return formattedDate;
    }

    public void printData() {
        System.out.println("Student id          : " + getStudentId());
        System.out.println("Student FirstName   : " + getFirstName());
        System.out.println("Student LastName    : " + getLastName());
        System.out.println("Student Birth Date  : " + getFormattedBirthDate());
        System.out.println("Student Age (Years) : " + getAgeInYear());
        System.out.println("Student Gender      : " + getGender());
        System.out.println("Student Total Marks : " + getTotalMarks());
        System.out.println("Student Percentage : " + getPercentage());
        System.out.println("Student Result : " + getResult());
    }
}
