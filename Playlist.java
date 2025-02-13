import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added: " + song);
    }

    public void removeSong(int index) {
        if (index >= 0 && index < songs.size()) {
            System.out.println("Removed: " + songs.get(index));
            songs.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (int i = 0; i < songs.size(); i++) {
                System.out.println(i + ": " + songs.get(i));
            }
        }
    }
}