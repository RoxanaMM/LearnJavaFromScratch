package testingDesignPatterns.behavioural.iterator.testingIterator;

public class TestingIte {

    public static void main(String...args){
        Item topic[] = new Item[5];
        topic[0] = new Item("topic0");
        topic[1] = new Item("topic1");
        topic[2] = new Item("topic2");
        topic[3] = new Item("topic3");

        TopicsList topicsList = new TopicsList(topic);
        Iterator<Item> iterator = topicsList.iterator();

        while(iterator.hasNextElement()){
            System.out.println(iterator.getCurrentElement().getName());
        }

    }
}
