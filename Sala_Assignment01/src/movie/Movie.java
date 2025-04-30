package movie;

/**
 * The {@code Movie} class represents a movie with a title, director, and duration.
 * It provides methods to retrieve and update the movie details.
 * 
 * @author: Sravya Geethika Sala
 * SID: 574309
 */

public class Movie {
    private String title;    // Title of the movie
    private String director; // Director of the movie
    private int duration;    // Duration of the movie in minutes

    /**
     * Constructs a new {@code Movie} object with the specified title and director.
     * 
     * @param title    The title of the movie.
     * @param director The director of the movie.
     */
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    /**
     * Gets the director of the movie.
     * 
     * @return The name of the director.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the duration of the movie.
     * 
     * @param duration The total duration of the movie in minutes.
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Displays the details of the movie, including the title, director, and duration.
     */
    public void displayMovie() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Total Duration: " + duration + " minutes.\n");
    }
}
