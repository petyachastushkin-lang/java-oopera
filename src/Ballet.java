public class Ballet extends MusicalShow {
    private Person Choreographer;

    public Ballet(String title, int duration, Director director,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);  // Вызываем родительский конструктор
        this.Choreographer = choreographer;  // Задаём своё уникальное поле
    }
}