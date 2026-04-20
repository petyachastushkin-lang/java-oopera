public class Person {
    protected String name;
    protected String surname;
    protected GenderOfPeople gender;

    public GenderOfPeople getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname, GenderOfPeople gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}
