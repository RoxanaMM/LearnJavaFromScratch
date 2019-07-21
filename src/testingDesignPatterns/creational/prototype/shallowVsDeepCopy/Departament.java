package testingDesignPatterns.creational.prototype.shallowVsDeepCopy;

public final class Departament implements Cloneable{

    private String id;
    private String name;

    private Departament(){}

    public Departament(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = new String(id);
    }

    public void setName(String name) {
        this.name = new String(name);
    }


    public String getId() {
        return new String(id);
    }

    public String getName() {
        return new String(name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
