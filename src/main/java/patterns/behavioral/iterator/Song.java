package patterns.behavioral.iterator;

public class Song {
    private String artist;
    private String title;

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
