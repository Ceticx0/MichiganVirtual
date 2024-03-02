// Gavin Perry 2024-2-29, The purpose of this program is define sequential search algorithms and use them on an array of Music objects.
import java.util.ArrayList;

public class MusicTesterV1 {
    public static void main(String[] args) {
        Music[] myMusic = {
            new Music("Rolling in the Deep", 2011, "Adele"),
            new Music("Hello", 2015, "Adele"),
            new Music("Montero", 2021, "Lil Nas X"),
            new Music("Chop Suey", 2001, "System of a down"),
            new Music("Sugar", 1998, "System of a down"),
            new Music("Aerials", 2002, "System of a down"),
            new Music("Ego Brain", 2002, "System of a down"),
            new Music("Portait of a Blank Slate", 2023, "Lovejoy"),
            new Music("Sydney", 2012, "Caravan Palace"),
            new Music("Smells Like Teen Spirit", 1991, "Nirvana")
        };

        System.out.println("Original List");
        printMusic(myMusic);
        System.out.println();
        System.out.println("Search - title - Rolling in the Deep");
        System.out.println(searchTitle(myMusic, "Rolling in the Deep"));
        System.out.println();
        System.out.println("Search - Artist - System of a down");
        printMusic(searchArtist(myMusic, "System of a down").toArray(new Music[0]));
        System.out.println();
        System.out.println("Search - Year - 2002");
        printMusic(searchYear(myMusic, 2002).toArray(new Music[0]));

    }

    public static void printMusic(Music[] music) {
        for (Music m : music) {
            System.out.println(m);
        }
    }

    public static Music searchTitle(Music[] music, String title) {
        for (Music m : music) {
            if (m.getTitle().equals(title)) {
                return m;
            }
        }
        return null;
    }

    public static ArrayList<Music> searchArtist(Music[] music, String artist) {
        ArrayList<Music> result = new ArrayList<>();
        for (Music m : music) {
            if (m.getArtist().equals(artist)) {
                result.add(m);
            }
        }
        return result;
    }

    public static ArrayList<Music> searchYear(Music[] music, int year) {
        ArrayList<Music> result = new ArrayList<>();
        for (Music m : music) {
            if (m.getYear() == year) {
                result.add(m);
            }
        }
        return result;
    }
}
