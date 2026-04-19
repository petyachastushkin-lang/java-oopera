import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Person Choreographer;
    private ArrayList<Person> listOfChoreographer = new ArrayList<>();

    public void addChoreographer(Person person) {
        listOfChoreographer.add(person);
    }

    public Ballet(String title, int duration, Person director,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);  // Вызываем родительский конструктор
        this.Choreographer = choreographer;  // Задаём своё уникальное поле
    }
}