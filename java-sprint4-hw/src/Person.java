import  java.util.Objects;
public class Person {
    private String name;
    private String surname;
    private GenderOfPeople gender;

    public GenderOfPeople getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname, GenderOfPeople gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}

class Actor extends Person {
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
                Objects.equals(getSurname(), actor.getSurname());   // Сравнение по имени и фамилии
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());              // Хеш‑код зависит от имени и фамилии
    }
}


class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, GenderOfPeople gender, int numberOfShows) {
        super(name, surname, gender); // вызов конструктора родителя
        this.numberOfShows = numberOfShows;
    }
}

class choreographer extends Person {
    public choreographer(String name, String surname, GenderOfPeople gender) {
        super(name, surname, gender);
    }
}

class musicAuthor extends Person {
    public musicAuthor(String name, String surname, GenderOfPeople gender) {
        super(name, surname, gender);
    }
}