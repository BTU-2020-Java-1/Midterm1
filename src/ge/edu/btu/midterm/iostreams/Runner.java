package ge.edu.btu.midterm.iostreams;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieService movieService = new MoviesServiceImpl();

        while (true) {
            System.out.println("1. ფილმის დამატება");
            System.out.println("2. შეფასების დაწერა");
            System.out.println("3. ინფორმაციის დაბეჭდვა");
            System.out.println("0. გამოსვლა");

            String option = scanner.nextLine();
            if (option.equals("0")) {
                break;
            }
            switch (option) {
                case "1":
                    System.out.println("ფილმის id:");
                    long id = Long.parseLong(scanner.nextLine());
                    System.out.println("ფილმის სახელი:");
                    String name = scanner.nextLine();
                    Movie movie = new Movie(id, name);
                    movieService.saveMovie(movie);
                    break;
                case "2":
                    System.out.println("ფილმის id:");
                    movie = movieService.readMovie(Long.parseLong(scanner.nextLine()));
                    System.out.println("ქულა:");
                    int point = Integer.parseInt(scanner.nextLine());
                    movie.addPoint(point);
                    movieService.saveMovie(movie);
                    break;
                case "3":
                    System.out.println("ფილმის id:");
                    movie = movieService.readMovie(Long.parseLong(scanner.nextLine()));
                    System.out.println(movie);
                    break;
                default:
                    System.out.println("არასწორი ოპცია");
            }
        }
    }
}
