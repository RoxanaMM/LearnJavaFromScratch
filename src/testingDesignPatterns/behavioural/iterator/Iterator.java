package testingDesignPatterns.behavioural.iterator;

public interface Iterator<E> {

    E getCurrentElement();
    E getNextEleemnt();
    boolean hasNextElement();
    void reset();
}
