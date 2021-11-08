package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime>  playTime = new ArrayList<>();

    public Movie(String title, List<LocalDateTime> playTime) {
        this.title = title;
        this.playTime = playTime;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getPlayTime() {
        return playTime;
    }
}
