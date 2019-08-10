package testingDesignPatterns.behavioural.memento;

public class Article {
    private String id;
    private String name;
    private String date;

    public Article(String id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArticleMemento createMemento() {
        ArticleMemento articleMemento = new ArticleMemento(id, name, date);
        return articleMemento;
    }

    public void restore(ArticleMemento articleMemento) {
        this.id = articleMemento.getId();
        this.name = articleMemento.getName();
        this.date = articleMemento.getDate();
    }

    public String toString() {
        return "Article id: " + id + "name " + name + "date: " + date;
    }


}
