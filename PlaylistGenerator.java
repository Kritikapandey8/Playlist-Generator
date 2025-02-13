import java.util.Scanner;

public class PlaylistGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();
        String command;

        System.out.println("Welcome to the Playlist Generator!");
        
        do {
            System.out.println("\nAvailable commands: add, remove, view, exit");
            System.out.print("Enter a command: ");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    
                    System.out.print("Enter song artist: ");
                    String artist = scanner.nextLine();
                    Song song = new Song(title, artist);
                    playlist.addSong(song);
                    break;

                case "remove":
                    System.out.print("Enter the index of the song to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    playlist.removeSong(index);
                    break;

                case "view":
                    playlist.displayPlaylist();
                    break;

                case "exit":
                    System.out.println ("Exiting the Playlist Generator. Goodbye!");
                    break;

                default:
                    System.out.println("Unknown command. Please try again.");
            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}