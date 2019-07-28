package testingDesignPatterns.behavioural.iterator;

public class Topics implements Iterator<Topic>{
    public int position;
    public Topic topics[];

    public Topics(Topic topics[]){
        this.topics = topics;
        position = 0;
    }

    public Topic getCurrentElement() {
        return topics[position];
    }

    @Override
    public Topic getNextEleemnt() {
        return topics[position ++];
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
