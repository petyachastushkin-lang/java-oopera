import java.util.ArrayList;
import java.util.List;

public class Theatre {
    public static void main(String[] args) {
        //режисеры
        Director дима = new Director("Дмитрий", "Колокшанский", GenderOfPeople.MALE, 10);
        Director полина = new Director("Ульяна", "Плешанова", GenderOfPeople.FEMALE, 30);
        //авторы музыки
        Person арсений = new musicAuthor("Арсений", "Силонов", GenderOfPeople.MALE);
        //хореографы
        Person лера = new choreographer("Лера", "Пучкова", GenderOfPeople.FEMALE);
        //актеры
        Actor анжелика = new Actor("Анжелика", "Ковалева", GenderOfPeople.FEMALE, 166);
        Actor андрей = new Actor("Андрей", "Владимиров", GenderOfPeople.MALE, 187);
        Actor александр = new Actor("Александр", "Староверов", GenderOfPeople.MALE, 178);
        Actor петя = new Actor("Петр", "Частушкин", GenderOfPeople.MALE, 173);


        Show show = new Show("Чайке Чехова",
                120,
                дима);
        show.addDirector(дима);
        show.addActor(анжелика);
        show.addActor(андрей);
        show.addActor(александр);
        show.listOfActorsShow();

        Opera opera = new Opera(
                "Опере Богема пуччини",
                150,
                полина,
                арсений,
                "ДЕЙСТВИЕ ПЕРВОЕ\n" +
                        "В мансарде\n" +
                        "(Мансарда. Широкое окно, из которого видны крыши, покрытые снегом. Убогая обстановка." +
                        " Рудольф мечтательно смотрит в окно. Марсель работает над картиной «Переход через Красное" +
                        " море», дуя время от времени на закоченевшие пальцы.)",
                105
        );
        opera.addActor(андрей);
        opera.addActor(александр);
        opera.listOfActorsShow();
        System.out.println("В актерском составе случилась замена");
        opera.replaceActor(александр, анжелика);
        opera.listOfActorsShow();
        opera.printLibretto();

        Ballet ballet = new Ballet(
                "Балете Лебединое озеро",
                90,
                полина,
                арсений,
                "ПРОЛОГ\n" +
                        "\n" +
                        "Старинный парк. Принцесса Одетта грустит. Внезапно появляется незнакомец в сопровождении" +
                        " свиты. Это Ротбарт – Злой гений. Он предлагает принцессе руку и сердце, но Одетта отвергает" +
                        " его. Ротбарт превращает ее в белого лебедя.\n" +
                        "\n" +
                        "ДЕЙСТВИЕ ПЕРВОЕ\n" +
                        "\n" +
                        "Картина первая\n" +
                        "\n" +
                        "Сад перед замком владетельной принцессы. Принц Зигфрид веселится с друзьями: забавные пляски" +
                        " шута сменяются танцами девушек и их кавалеров.",
                лера
        );
        ballet.addActor(анжелика);
        ballet.addActor(александр);
        ballet.listOfActorsShow();
        ballet.replaceActor(андрей, петя);
        ballet.printLibretto();


    }

}