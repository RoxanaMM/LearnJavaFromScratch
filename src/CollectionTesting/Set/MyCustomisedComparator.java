package CollectionTesting.Set;

public class MyCustomisedComparator implements Comparable<MyCustomisedComparator>{

    private String name;
    private Integer id;

    private MyCustomisedComparator(){
        this.id = 20;
        this.name = "Roxana";
    }
    @Override
    public int compareTo(MyCustomisedComparator myCustomisedComparator) {
      return  this.id - myCustomisedComparator.id;
    }
}
