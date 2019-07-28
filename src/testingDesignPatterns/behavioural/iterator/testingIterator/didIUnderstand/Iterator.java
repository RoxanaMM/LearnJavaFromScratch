package testingDesignPatterns.behavioural.iterator.testingIterator.didIUnderstand;

public interface Iterator<E> {
    E getCurrentElement();
    E getNextElement();
    boolean hasNextElement();
    void reset();
}
