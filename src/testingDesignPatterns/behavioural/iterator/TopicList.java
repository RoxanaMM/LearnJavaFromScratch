package testingDesignPatterns.behavioural.iterator;

public class TopicList implements List {

    private Topic topics[];

    public TopicList(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public Iterator iterator() {
        return new Topics(topics);
    }
}
