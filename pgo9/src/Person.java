import java.time.Year;
abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int birthdayYear;
    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }
    public int getAge() {
        int dataAktualna = Year.now().getValue();
        int wiek = dataAktualna - this.birthdayYear;
        return wiek;
    }
}