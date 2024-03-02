// Gavin Perry, 2/23/2024, The purpose of this program is to sort movies by title, year, and studio using insertion sort and the Movie class.
public class MovieTesterV2 {
    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("Back to the Future", 1985, "Universal Pictures"),
            new Movie("The Breakfast Club", 1985, "A&M Films"),
            new Movie("The Lion King", 1994, "Walt Disney Pictures"),
            new Movie("Inside Out", 2015, "Walt Disney Pictures"),
            new Movie("The Godfather", 1972, "Paramount Pictures"),
            new Movie("The Matrix 2", 2003, "Warner Bros."),
            new Movie("The Godfather 2", 1974, "Paramount Pictures"),
            new Movie("A Beautiful Mind", 2001, "Universal Pictures"),
            new Movie("The Dark Knight", 2008, "Warner Bros."),
            new Movie("The Shawshank Redemption", 1994, "Castle Rock Entertainment")
        };

        System.out.println("Original list of movies:");
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by title");
        movies = sortMoviesByTitle(movies, 1);
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by year");
        movies = sortMoviesByYear(movies, 1);
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by studio");
        movies = sortMoviesByStudio(movies, 1);
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by title descending");
        movies = sortMoviesByTitle(movies, 2);
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by year descending");
        movies = sortMoviesByYear(movies, 2);
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by studio descending");
        movies = sortMoviesByStudio(movies, 2);
        printMovies(movies);

    }

    public static void printMovies(Movie[] movies) {
        System.out.printf("%-30s %4s   %-20s%n", "Title", "Year", "Studio");
        System.out.println("============================================================");
        for (Movie movie : movies) {
            if (movie != null) {
                System.out.println(movie);
            }
        }
    }

    // insertion sort moves, ascending 1 or descending 2
    public static Movie[] sortMoviesByTitle(Movie[] movies, int order) {
        for (int i = 1; i < movies.length; i++) {
            Movie next = movies[i];
            int j = i;
            if (order == 1) {
                while (j > 0 && movies[j - 1].getTitle().compareTo(next.getTitle()) > 0) {
                    movies[j] = movies[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && movies[j - 1].getTitle().compareTo(next.getTitle()) < 0) {
                    movies[j] = movies[j - 1];
                    j--;
                }
            }
            movies[j] = next;
        }
        return movies;
    }

    public static Movie[] sortMoviesByYear(Movie[] movies, int order) {
        for (int i = 1; i < movies.length; i++) {
            Movie next = movies[i];
            int j = i;
            if (order == 1) {
                while (j > 0 && movies[j - 1].getYear() > next.getYear()) {
                    movies[j] = movies[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && movies[j - 1].getYear() < next.getYear()) {
                    movies[j] = movies[j - 1];
                    j--;
                }
            }
            movies[j] = next;
        }
        return movies;
    }

    public static Movie[] sortMoviesByStudio(Movie[] movies, int order) {
        for (int i = 1; i < movies.length; i++) {
            Movie next = movies[i];
            int j = i;
            if (order == 1) {
                while (j > 0 && movies[j - 1].getStudio().compareTo(next.getStudio()) > 0) {
                    movies[j] = movies[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && movies[j - 1].getStudio().compareTo(next.getStudio()) < 0) {
                    movies[j] = movies[j - 1];
                    j--;
                }
            }
            movies[j] = next;
        }
        return movies;
    }
}
