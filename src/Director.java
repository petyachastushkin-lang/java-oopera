public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, GenderOfPeople gender, int numberOfShows) {
        super(name, surname, gender); // вызов конструктора родителя
        this.numberOfShows = numberOfShows;
    }
}