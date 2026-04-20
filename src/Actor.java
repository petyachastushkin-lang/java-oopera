import java.util.Objects;

public class Actor extends Person {
    private int height;

    public int getHeight() {
        return this.height;
    }

    public Actor(String name, String surname, GenderOfPeople gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
            Actor actor = (Actor) obj;
            return Objects.equals(this.name, actor.name) &&
                    Objects.equals(this.surname, actor.surname) &&
                    Objects.equals(this.height, actor.height);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.surname, this.height);
    }

    @Override
    public String toString() {
        return this.name+ " " + this.surname + " " + this.height;
    }
}
