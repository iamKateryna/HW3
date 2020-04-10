import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int birthYear;

    public void setFirstName(String FirstName ) {this.firstName = FirstName; }
    public void setLastName(String LastName ) {this.lastName = LastName; }
    public void setBirthYear(int BirthYear ) {this.birthYear = BirthYear; }


    public String getFirstName() {return this.firstName; }
    public String getLastName() {return this.lastName; }
    public int getBirthYear() {return this.birthYear; }

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    int getAge(){
        int age = 2020 - birthYear;
        return age;
    }

    void input() {
        System.out.println("What is your first name?");
        String fName = scanner.nextLine();
        setFirstName(fName);
        System.out.println("What is your last name?");
        String lName = scanner.nextLine();
        setLastName(lName);
        System.out.println("What is your birth year?");
        int bYear = scanner.nextInt();
        setBirthYear(bYear);
    }

    void output() {
        System.out.println("Name: " + this.firstName + ", surname: " + lastName + ", age: " + getAge() );
    }

    void changename(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }
}
