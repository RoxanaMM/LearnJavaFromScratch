package testingDesignPatterns.behavioural.memento;

public final class ArticleMemento {
    private final String id;
    private final String name;
    private final String date;

    public ArticleMemento(String id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public ArticleMemento (Article article){
        this.id = article.getId();
        this.name = article.getName();
        this.date = article.getDate();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
    public String toString() {
        return "Article id: " + id + "name " + name + "date: " + date;
    }
}
