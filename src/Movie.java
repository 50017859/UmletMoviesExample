import java.time.LocalDate;
import java.util.HashSet;

public class Movie {
    private String name;
    private LocalDate ReleaseDate;
    private int Length;
    private HashSet<Genre> genres; //Movie has Genre - composition
    private HashSet<Director> directors;
    private HashSet<Actor> actors;

    public Movie(String aName, LocalDate aReleaseDate, int aLength, HashSet<Genre> genres, HashSet<Director> directors, HashSet<Actor> actors){ //Constructor
        this.name = aName;
        this.ReleaseDate = aReleaseDate;
        this.Length = aLength;
        this.genres = genres;
        this.directors = directors;
        this.actors = actors;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getReleaseDate() {
        return this.ReleaseDate;
    }

    public int getLength() {
        return this.Length;
    }

    public HashSet<Genre> getGenres () {
        return this.genres;
    }

    /**
     * Adds a genre to the collection of genres
     * @param g iss the genre to add
     */
    public void addGenre(Genre g) {
        this.genres.add(g);
    }

    public void addDirector(Director d) {
        this.directors.add(d);
    }

    public void addGenre(Director d) {
        this.directors.add(d);
    }
}
