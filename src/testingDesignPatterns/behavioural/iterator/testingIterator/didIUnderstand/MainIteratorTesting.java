package testingDesignPatterns.behavioural.iterator.testingIterator.didIUnderstand;

public class MainIteratorTesting {
    public static void main(String...args){
        Item items[] = new Item[5];

        items[0] = new Item("item0");
        items[1] = new Item("item1");

        TopicList topicList = new TopicList(items);
        Iterator<Item> itemIterator = topicList.iterator();

        while(itemIterator.hasNextElement()){
            System.out.println(itemIterator.getCurrentElement().getName());
        }
    }
}