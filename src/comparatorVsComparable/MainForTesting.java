package comparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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


            Movie movie = new Movie("ion cu soarca",2,2002);
            Movie.BY_RATING_COMPARATOR.reversed();
            Collections.sort(list);


        for (Movie movie1: list){
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
