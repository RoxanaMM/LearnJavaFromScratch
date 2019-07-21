package testingDesignPatterns.creational.prototype.shallowVsDeepCopy;

public class ShallowVsDeepTestingMain {

    public static void main(String...args){
        Departament departament = new Departament("Ana", "Ion");
        Employee employee = new Employee("1","Finance", departament);
        Employee clonedEmployee = null;
        try {
            clonedEmployee = (Employee) employee.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        clonedEmployee.getDepartament().setId("2");
        System.out.println(employee.toString());
        System.out.println(clonedEmployee.toString());
    }
}
