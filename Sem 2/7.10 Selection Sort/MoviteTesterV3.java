// Gavin Perry, 2024-2-23, The purpose of this program is to use selection sort to sort an array of movies by title, year, and studio and display the results.
public class MoviteTesterV3 {
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
        sortMoviesByTitle(movies, 1);
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by year");
        sortMoviesByYear(movies, 1);
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by studio");
        sortMoviesByStudio(movies, 1);
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by title descending");
        sortMoviesByTitle(movies, 2);
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by year descending");
        sortMoviesByYear(movies, 2);
        printMovies(movies);
        System.out.println();
        System.out.println("Sort Movies by studio descending");
        sortMoviesByStudio(movies, 2);
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

    public static void sortMoviesByTitle(Movie[] movies, int order) {
        int i;
        int k;
        int posMax;
        Movie temp;
        for(i = movies.length - 1; i >= 0; i--)
        {
            // find largest element in the i elements
            posMax = 0;
            if(order == 1) {
                for( k = 0; k <= i; k++ )
                {
                    if( movies[k].getTitle().compareTo(movies[ posMax ].getTitle()) > 0)
                    posMax = k;
                }
            } else if (order == 2) {
                for( k = 0; k <= i; k++ )
                {
                    if( movies[k].getTitle().compareTo(movies[ posMax ].getTitle()) < 0)
                    posMax = k;
                }
            }
            // swap w/ largest
            temp = movies[i];
            movies[i] = movies[posMax];
            movies[posMax] = temp;
        } 

    }

    public static void sortMoviesByYear(Movie[] movies, int order) {
        int i;
        int k;
        int posMax;
        Movie temp;
        for(i = movies.length - 1; i >= 0; i--)
        {
            // find largest element in the i elements
            posMax = 0;
            if(order == 1) {
                for( k = 0; k <= i; k++ )
                {
                    if( movies[k].getYear() > movies[ posMax ].getYear())
                    posMax = k;
                }
            } else if (order == 2) {
                for( k = 0; k <= i; k++ )
                {
                    if( movies[k].getYear() < movies[ posMax ].getYear())
                    posMax = k;
                }
            }
            // swap w/ largest
            temp = movies[i];
            movies[i] = movies[posMax];
            movies[posMax] = temp;
        } 
    }

    public static void sortMoviesByStudio(Movie[] movies, int order) {
        int i;
        int k;
        int posMax;
        Movie temp;
        for(i = movies.length - 1; i >= 0; i--)
        {
            // find largest element in the i elements
            posMax = 0;
            if(order == 1) {
                for( k = 0; k <= i; k++ )
                {
                    if( movies[k].getStudio().compareTo(movies[ posMax ].getStudio()) > 0)
                    posMax = k;
                }
            } else if (order == 2) {
                for( k = 0; k <= i; k++ )
                {
                    if( movies[k].getStudio().compareTo(movies[ posMax ].getStudio()) < 0)
                    posMax = k;
                }
            }
            // swap w/ largest
            temp = movies[i];
            movies[i] = movies[posMax];
            movies[posMax] = temp;
        } 
    }
}
