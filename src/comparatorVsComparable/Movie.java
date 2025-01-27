package comparatorVsComparable;

import java.util.Comparator;

public class Movie implements Comparable<Movie> {

    private double rating;
    private String name;
    private int year;

    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    public static final Comparator<Movie> BY_RATING_COMPARATOR = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.rating < o1.rating ? 1 : 0;
        }
    };
}
