package testingDesignPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartament implements Departament{

    private List<Departament> departamentList = new ArrayList<Departament>();

    @Override
    public void printDepartamentName() {
        departamentList.forEach(Departament::printDepartamentName);
    }

    public void addAnotherDepartament(Departament departament){
        departamentList.add(departament);
    }

    public void removeAnotherDepartament(Departament departament){
        departamentList.remove(departament);
    }
}
