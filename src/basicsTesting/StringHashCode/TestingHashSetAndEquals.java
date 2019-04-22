package basicsTesting.StringHashCode;

import basicsTesting.serialiaztion.Employee;

import java.util.HashSet;

public class TestingHashSetAndEquals {

    public static void main(String[] args) {
        Employee employee = new Employee("rajeev", 24);
        Employee employee1 = new Employee("rajeev", 25);
        Employee employee2 = new Employee("rajeev", 24);

        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        System.out.println(employees.contains(employee2));
        System.out.println("employee.hashCode():  " + employee.hashCode()
                + "  employee2.hashCode():" + employee2.hashCode());

      //  List<Integer> integerList = List.of(Integer.valueOf(1), Integer.valueOf(2));
        //Map<String,Integer> myDemoMap = new HashMap.ne;

    }

}
