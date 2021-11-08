package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Cinema {
    private List<Movie> filmLists = new ArrayList<>();

    public void addMovie(Movie movie) {
        filmLists.add(movie);
    }

    public String findMovieByTime(LocalDateTime time) {
        List<String> goodTime = new ArrayList<>();
        for (Movie m: filmLists) {
            if (isTimeGood(m, time)) {
                goodTime.add(m.getTitle());
            }
        }
        return goodTime.toString();
    }

    private boolean isTimeGood(Movie m, LocalDateTime time) {
        for (LocalDateTime ldt: m.getPlayTime()) {
            if (ldt.equals(time)) {
                return true;
            }
        }
        return false;
    }
}
