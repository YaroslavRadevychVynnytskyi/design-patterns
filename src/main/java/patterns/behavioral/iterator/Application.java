package patterns.behavioral.iterator;

import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        RadioStation myRadio = new RadioStation();
        myRadio.addRockSongs(new Song("Queen", "Bohemian Rhapsody"), new Song("Led Zeppelin", "Stairway to Heaven"));
        myRadio.addPopSongs(new Song("Michael Jackson", "Billie Jean"), new Song("ABBA", "Dancing Queen"));
        myRadio.addClassicSongs(new Song("Beethoven", "Fur Elise"), new Song("Mozart", "Symphony No. 40"));

        System.out.println("--- Radio Playlist Start ---");

        Iterator<Song> iterator = myRadio.iterator();

        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song);
        }

        System.out.println("--- Radio Playlist End ---");
    }
}
