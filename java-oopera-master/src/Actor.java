import java.util.Objects;

public class Actor extends Person {
    private int height;

    public int getHeight() {
        return height;
    }

    public Actor(String name, String surname, GenderOfPeople gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                    // Объект сравнивается сам с собой
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и тип

        Actor actor = (Actor) obj;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) &&
                Objects.equals(getHeight(), actor.getHeight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getHeight());
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " " + getHeight();
    }

}