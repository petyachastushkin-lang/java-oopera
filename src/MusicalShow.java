public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);  // Инициализируем поля из Show
        this.musicAuthor = musicAuthor;     // Свои поля задаём здесь
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Текст либретто: " + librettoText);
    }


}