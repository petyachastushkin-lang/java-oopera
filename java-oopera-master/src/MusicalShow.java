public class MusicalShow extends Show {
    protected Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Person director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);  // Инициализируем поля из Show
        this.musicAuthor = musicAuthor;     // Свои поля задаём здесь
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Текст либретто: " + librettoText);
    }


}