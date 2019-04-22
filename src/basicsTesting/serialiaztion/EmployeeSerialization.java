package basicsTesting.serialiaztion;

import java.io.Serializable;

public class EmployeeSerialization implements Serializable{

    private transient int id;

    EmployeeSerialization(){
        System.out.println("Hello from basicsTesting.serialiaztion.EmployeeSerialization");
        this.id = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
