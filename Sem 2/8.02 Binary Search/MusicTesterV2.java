// Gavin Perry 2024-3-1, The purpose of this program is define binary search algorithms and printers and use them on an array of Music objects.
public class MusicTesterV2 {
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
        System.out.println("Songs Searched by Year");
        binarySearchYear(myMusic, 2002);
        System.out.println();
        System.out.println("Songs Searched by Artist");
        binarySearchArtist(myMusic, "System of a down");
        System.out.println();
        System.out.println("Songs Searched by Title");
        binarySearchTitle(myMusic, "Rolling in the Deep");
        

    }

    public static void printMusic(Music[] music) {
        for (Music m : music) {
            System.out.println(m);
        }
    }

    public static void insertionSortByTitle(Music[] music) {
        for (int i = 1; i < music.length; i++) {
            Music key = music[i];
            int j = i - 1;
            while (j >= 0 && music[j].getTitle().compareTo(key.getTitle()) > 0) {
                music[j + 1] = music[j];
                j--;
            }
            music[j + 1] = key;
        }
    }

    public static void insertionSortByYear(Music[] music) {
        for (int i = 1; i < music.length; i++) {
            Music key = music[i];
            int j = i - 1;
            while (j >= 0 && music[j].getYear() > key.getYear()) {
                music[j + 1] = music[j];
                j--;
            }
            music[j + 1] = key;
        }
    }

    public static void insertionSortByArtist(Music[] music) {
        for (int i = 1; i < music.length; i++) {
            Music key = music[i];
            int j = i - 1;
            while (j >= 0 && music[j].getArtist().compareTo(key.getArtist()) > 0) {
                music[j + 1] = music[j];
                j--;
            }
            music[j + 1] = key;
        }
    }

    public static void binarySearchTitle(Music[] music, String title) {
        insertionSortByTitle(music);
        int low = 0;
        int high = music.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (music[mid].getTitle().compareTo(title) < 0) {
                low = mid + 1;
            } else if (music[mid].getTitle().compareTo(title) > 0) {
                high = mid - 1;
            } else {
                lpTitle(music, mid, title);
                return;
            }
        }
        System.out.println("Title not found");
    }

    public static void binarySearchArtist(Music[] music, String artist) {
        insertionSortByArtist(music);
        int low = 0;
        int high = music.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (music[mid].getArtist().compareTo(artist) < 0) {
                low = mid + 1;
            } else if (music[mid].getArtist().compareTo(artist) > 0) {
                high = mid - 1;
            } else {
                lpArtist(music, mid, artist);
                return;
            }
        }
        System.out.println("Artist not found");
    }

    public static void binarySearchYear(Music[] music, int year) {
        insertionSortByYear(music);
        int low = 0;
        int high = music.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (music[mid].getYear() < year) {
                low = mid + 1;
            } else if (music[mid].getYear() > year) {
                high = mid - 1;
            } else {
                lpYear(music, mid, year);
                return;
            }
        }
        System.out.println("Year not found");
    }

    public static void lpTitle(Music[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while ((i >= 0) && (r[i].getTitle().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while ((i < r.length) && (r[i].getTitle().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        // now print out the matches
        for (i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void lpArtist(Music[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while ((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while ((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        // now print out the matches
        for (i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void lpYear(Music[] r, int low, int toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while ((i >= 0) && (r[i].getYear() == toFind)) {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while ((i < r.length) && (r[i].getYear() == toFind)) {
            end = i;
            i++;
        }
        // now print out the matches
        for (i = start; i <= end; i++)
            System.out.println(r[i]);
    }
}
