package testingDesignPatterns.behavioural.iterator.testingIterator;

public interface Iterator<E>{

    E getCurrentElement();
    E getNextElement();
    boolean hasNextElement();
    void reset();

}
