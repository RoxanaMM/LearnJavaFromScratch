package basicsTesting.serialiaztion;

import java.io.*;

public class EmployeeSerilizationMainTesting extends EmployeeSerialization
    {

    private String s;
    private EmployeeSerialization employeeSerilization;

    EmployeeSerilizationMainTesting(String s ){
        System.out.println("Hello from basicsTesting.serialiaztion.EmployeeSerilizationMainTesting");

        this.s = s;
        setId(2);
    }

    public String toString() {
        return s + " " + getId();
    }

    public static void serialize(Object object, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
        objectOutput.writeObject(object);
        objectOutput.flush();
        fileOutputStream.close();
        System.out.println(object.toString());
    }

    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileOutputStream = new FileInputStream(fileName);
        ObjectInputStream objectInput = new ObjectInputStream(fileOutputStream);
        EmployeeSerilizationMainTesting object = (EmployeeSerilizationMainTesting) objectInput.readObject();
        fileOutputStream.close();
        System.out.println(object.toString());
        return object;
    }

    public static void main(String []args){
        String fileName = "C:\\Users\\RoxanaM\\Desktop\\kiki.txt";
        EmployeeSerilizationMainTesting employeeSerializationMainTesting = new EmployeeSerilizationMainTesting("Serial");

        try {
            serialize(employeeSerializationMainTesting, fileName);
            deserialize(fileName);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
