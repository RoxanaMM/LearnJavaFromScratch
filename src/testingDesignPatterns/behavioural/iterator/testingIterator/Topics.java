package testingDesignPatterns.behavioural.iterator.testingIterator;

public class Topics implements Iterator {

    private Item topics[];
    private int position;

    public Topics(Item topics[]){
        this.topics = topics;
    }
    @Override
    public Object getCurrentElement() {
        return topics[position];
    }

    @Override
    public Object getNextElement() {
        return topics[position++];
    }

    @Override
    public boolean hasNextElement() {
        return topics[position++] != null ? true : false;
    }

    @Override
    public void reset() {
        position = 0;
    }
}