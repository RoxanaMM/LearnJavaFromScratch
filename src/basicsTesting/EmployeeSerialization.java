package basicsTesting;

import java.io.Serializable;

public class EmployeeSerialization{

    private int id;

    EmployeeSerialization(){
        System.out.println("Hello from basicsTesting.EmployeeSerialization");
        this.id =1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
