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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
            Actor actor = (Actor)obj;
            return Objects.equals(this.getName(), actor.getName()) && Objects.equals(this.getSurname(), actor.getSurname()) && Objects.equals(this.getHeight(), actor.getHeight());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getName(), this.getSurname(), this.getHeight()});
    }

    public String toString() {
        String var10000 = this.getName();
        return var10000 + " " + this.getSurname() + " " + this.getHeight();
    }
}
