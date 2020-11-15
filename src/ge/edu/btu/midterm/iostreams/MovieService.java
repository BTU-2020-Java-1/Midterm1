package ge.edu.btu.midterm.iostreams;

public interface MovieService {

    void saveMovie(Movie movie);

    Movie readMovie(long id);
}
