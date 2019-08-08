package testingDesignPatterns.behavioural.memento;

public class MementoTestingClass {
    public static void main(String... args) {
        Article article = new Article("1", "Roxi", "11/06/1995");
        ArticleMemento articleMemento = new ArticleMemento(article);
        System.out.println(articleMemento.toString());
        article.setDate("11/02/1000");
        System.out.println(articleMemento.toString());
        System.out.println(article.toString());
        article.restore(articleMemento);
        System.out.println(article.toString());
    }
}
