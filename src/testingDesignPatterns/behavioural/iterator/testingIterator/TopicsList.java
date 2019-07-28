package testingDesignPatterns.behavioural.iterator.testingIterator;


public class TopicsList implements List {

    Item[] topic;

    public TopicsList(Item[] topic) {
        this.topic = topic;
    }

    @Override
    public Iterator iterator() {
        return new Topics(topic);
    }
}
