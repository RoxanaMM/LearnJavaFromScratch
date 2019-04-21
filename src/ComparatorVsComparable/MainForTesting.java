package ComparatorVsComparable;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MainForTesting {

    public static void main(String[] args)
    {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 2977));
        list.add(new Movie("Empire Strikes Back", 9.8, 1980));
        list.add(new Movie("Return of the Jedi", 10, 1983));


        List<Movie> listCopy = new ArrayList<Movie>(list);

        Collections.sort(list);
        System.out.println("Movies after sorting : ");

    //    Movie movie = new Movie("ion cu soarca",2,2002);
        Collections.sort(list);//, Movie.BY_RATING_COMPARATOR.reversed());


        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }



        List <Integer> myIntegerList = new ArrayList<>();
        myIntegerList.add(123);
        myIntegerList.add(233);
        myIntegerList.add(222333);
        Collections.sort(myIntegerList);
    }

}
