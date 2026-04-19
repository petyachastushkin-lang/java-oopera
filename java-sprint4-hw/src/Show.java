import java.util.ArrayList;

class Show {
    private String title;
    private int duration;
    private Person Director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();
    public ArrayList<Director> listOfDirector = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<>();

    public ArrayList<Actor> getActors() {
        return actors;
    }


    // Конструктор с параметрами
    public Show(String title, int duration, Person director) {
        this.title = title;
        this.duration = duration;
        this.Director = director;
    }

    public void addActor(Actor actor) {
        if (!actors.contains(actor)) {
            actors.add(actor);
        } else {
            System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() + " уже в списке.");
        }
    }


    public void addDirector(Director director) {
        listOfDirector.add(director);
    }

    public void removeActor(Actor actor) {
        listOfActors.remove(actor);
    }


    public String getTitle() {
        return title;
    }

    public void listOfActorsShow() {
        System.out.println("В " + title + ". Участвуют ");
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname()+" "+
                    actor.getHeight());
        }
        System.out.println(" ");
    }

    public boolean replaceActor(Actor oldActor, Actor newActor) {
        // Проверяем, есть ли старый актёр в списке
        if (!listOfActors.contains(oldActor)) {
            System.out.println("Актёр " + oldActor.getName() + " " + oldActor.getSurname() +
                    " не найден в списке актёров шоу.");
            return false; // Замена не выполнена — актёра нет в списке
        }

        // Удаляем старого актёра
        listOfActors.remove(oldActor);

        // Добавляем нового актёра
        listOfActors.add(newActor);

        System.out.println("Актёр " + oldActor.getName() + " " + oldActor.getSurname() + " Заменен на " +
                newActor.getName() + " " + newActor.getSurname());
        System.out.println(" ");
        return true;
    }

}