package testingDesignPatterns.creational.prototype.shallowVsDeepCopy;

public class Employee implements Cloneable {
    private String id;
    private String name;
    private Departament departament;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String id, String name, Departament departament) {
        this.id = id;
        this.name = name;
        this.departament = departament;
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

    public String toString() {

        if (departament != null && departament.getName() != null && departament.getId() != null) {
            return id.toString() + name.toString() + departament.getId().toString() + departament.getName().toString();
        } else {
            return id.toString() + name.toString();
        }
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //for shallow copy, we simple return the super.clone();

        //return super.clone();

        //for deep copy we return a new object that is the clone of that object.

        Employee clonedEmployee = (Employee) super.clone();
        clonedEmployee.departament = new Departament("","");
        return clonedEmployee;

    }
}
