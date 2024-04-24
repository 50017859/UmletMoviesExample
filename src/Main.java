import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.parse("1999-01-23");

        HashSet<Genre> genres = new HashSet<>();
        boolean added = genres.add(Genre.HORROR);
        genres.add(Genre.THRILLER);

        LocalDate ld2 = LocalDate.parse("2004-03-02");
        Director d = new Director("Jim Bob", "British", ld2);
        LocalDate ld3 = LocalDate.parse("2001-12-09");
        Director d2 = new Director("Stevie Wonders", "American", ld3);
        HashSet<Director> directors = new HashSet<>();
        directors.add(d);
        directors.add(d2);

        LocalDate ld4 = LocalDate.parse("1987-04-12");
        Actor a1 = new Actor("Young Phil", "Spanish", ld4);
        LocalDate ld5 = LocalDate.parse("1987-04-12");
        Actor a2 = new Actor("Young Phil", "Spanish", ld4);
        HashSet<Actor> actors = new HashSet<>();
        actors.add(a1);
        actors.add(a2);

        Movie bwp = new Movie("The Blair Witch Project", ld, 81, genres, directors, actors);
    }
}