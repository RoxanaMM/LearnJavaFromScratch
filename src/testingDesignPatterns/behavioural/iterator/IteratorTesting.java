package testingDesignPatterns.behavioural.iterator;

public class IteratorTesting {

    public static void main(String... args) {
        Topic[] topics = new Topic[5];
        topics[0] = new Topic("topic1");
        topics[1] = new Topic("topic2");

        List<Topic> topicList = new TopicList(topics);
        Iterator<Topic> iterator = topicList.iterator();

        do {
            System.out.println(iterator.getCurrentElement().getName() != null ? iterator.getCurrentElement().getName() : "");
        } while (iterator.hasNextElement());

    }
}
