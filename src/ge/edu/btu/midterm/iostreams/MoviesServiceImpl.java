package ge.edu.btu.midterm.iostreams;

import java.io.*;

public class MoviesServiceImpl implements MovieService {

    @Override
    public void saveMovie(Movie movie) {
        String path = "data/" + movie.getId() + ".txt";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))){
            out.writeObject(movie);
        } catch (IOException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა " + ex.getMessage());
        }
    }

    @Override
    public Movie readMovie(long id) {
        String path = "data/" + id + ".txt";
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            return (Movie) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა " + ex.getMessage());
        }
        return null;
    }
}
