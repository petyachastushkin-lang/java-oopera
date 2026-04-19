import java.util.ArrayList;

public class MusicalShow extends Show {
    private Person MusicAuthor;
    private String librettoText;
    private ArrayList<Person> listOfMusicAuthor = new ArrayList<>();

    public void addMusicAuthor(Person person) {
        listOfMusicAuthor.add(person);
    }

    public MusicalShow(String title, int duration, Person director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);  // Инициализируем поля из Show
        this.MusicAuthor = musicAuthor;     // Свои поля задаём здесь
        this.librettoText = librettoText;
    }
    public void printLibretto() {
        System.out.println("Текст либретто: " + librettoText);
    }


}