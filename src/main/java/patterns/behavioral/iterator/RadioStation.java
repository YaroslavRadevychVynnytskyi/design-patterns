package patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class RadioStation implements Iterable<Song> {
    private final List<Song> rockSongs;
    private final List<Song> popSongs;
    private final List<Song> classicSongs;

    public RadioStation() {
        this.rockSongs = new ArrayList<>();
        this.popSongs = new ArrayList<>();
        this.classicSongs = new ArrayList<>();
    }

    public void addRockSong(Song song) {
        rockSongs.add(song);
    }

    public void addRockSongs(Song... songs) {
        rockSongs.addAll(List.of(songs));
    }

    public void addPopSong(Song song) {
        popSongs.add(song);
    }

    public void addPopSongs(Song... songs) {
        popSongs.addAll(List.of(songs));
    }

    public void addClassicSong(Song song) {
        classicSongs.add(song);
    }

    public void addClassicSongs(Song... songs) {
        classicSongs.addAll(List.of(songs));
    }

    @Override
    public Iterator<Song> iterator() {
        return new RadioIterator();
    }

    private class RadioIterator implements Iterator<Song> {
        int listIndex = 0;
        int songInListIndex = 0;

        @Override
        public boolean hasNext() {
            switch (listIndex) {
                case 0 -> {
                    if (songInListIndex != rockSongs.size()) return true;
                    if (!popSongs.isEmpty()) return true;
                    if (!classicSongs.isEmpty()) return true;
                }
                case 1 -> {
                    if (songInListIndex != popSongs.size()) return true;
                    if (!classicSongs.isEmpty()) return true;
                }
                case 2 -> {
                    if (songInListIndex != classicSongs.size()) return true;
                }
            }
            return false;
        }

        @Override
        public Song next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            List<Song> currentList = getSongListByIndex(listIndex);
            while (currentList.isEmpty()) {
                listIndex++;
                currentList = getSongListByIndex(listIndex);
            }

            Song song = currentList.get(songInListIndex);
            songInListIndex++;

            if (songInListIndex == currentList.size()) {
                listIndex++;
                songInListIndex = 0;
            }

            return song;
        }

        private List<Song> getSongListByIndex(int index) {
            return switch (index) {
                case 0 -> rockSongs;
                case 1 -> popSongs;
                case 2 -> classicSongs;
                default -> Collections.emptyList();
            };
        }
    }

}
