package testingDesignPatterns.behavioural.iterator.testingIterator.didIUnderstand;

public class TopicList implements List {
    Item[]topics;

    public TopicList(Item[] topics) {
        this.topics = topics;
    }

    @Override
    public Iterator iterator() {
        return new Topics(topics);
    }
}
