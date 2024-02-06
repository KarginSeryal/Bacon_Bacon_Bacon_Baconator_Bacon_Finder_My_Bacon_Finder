import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<SimpleMovie> movies1 = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        ArrayList<SimpleMovie> movies2 = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        ArrayList<SimpleMovie> movies3 = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        ArrayList<SimpleMovie> movies4 = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        for (SimpleMovie movie : movies1) {
            System.out.println(movie);
        }
        System.out.println("Number of movies: " + movies1.size());
    }
}