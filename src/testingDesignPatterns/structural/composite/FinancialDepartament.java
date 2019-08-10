package testingDesignPatterns.structural.composite;

public class FinancialDepartament implements Departament {
    @Override
    public void printDepartamentName() {
        System.out.println("This is financial departament");
    }
}
