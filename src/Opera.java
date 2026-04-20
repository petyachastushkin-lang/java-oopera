public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);  // Вызываем родительский конструктор
        this.choirSize = choirSize;  // Задаём своё уникальное поле
    }
}