package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> filmLists = new ArrayList<>();

    public void addMovie(Movie movie) {
        filmLists.add(movie);
    }

    public void findMovieByTime(LocalDateTime time) {
        System.out.println();
    }
}
