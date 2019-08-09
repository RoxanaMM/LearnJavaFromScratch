package testingDesignPatterns.structural.composite;

public class MainTestingComposite {
    public static void main(String...args){
        FinancialDepartament financialDepartament = new FinancialDepartament();
        SalesDepartament salesDepartament = new SalesDepartament();

        HeadDepartament headDepartament = new HeadDepartament();
        headDepartament.addAnotherDepartament(financialDepartament);
        headDepartament.addAnotherDepartament(salesDepartament);

        headDepartament.printDepartamentName();
    }
}
