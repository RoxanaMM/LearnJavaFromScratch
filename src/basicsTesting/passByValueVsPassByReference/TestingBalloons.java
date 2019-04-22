package basicsTesting.passByValueVsPassByReference;

public class TestingBalloons {

    private static void swap(Object object1, Object object2){
        Object temp = object1;
        System.out.println("temp is: " + temp.hashCode());
        object1 = object2;
        System.out.println("object1 is: " + object1.hashCode());
        object2 = temp;
        System.out.println("object2 is: " + object2.hashCode());
        //practic ce inteleg de aici e faptul ca daca incerci sa le inversezi obiectele
        //nu o sa mearga dar daca le setezi valorile ca in cealalta metoda
        //o sa mearga
    }

    private static void swapColours(Balloon balloon){
        balloon.setColor("red");
        //i-am setat valoarea si a mers
        System.out.println("in swapColors the balloon hashCode is: " + balloon.hashCode());
        balloon = new Balloon("grey");
        //dar aici am construit un alt obiect, nu cel cu care am apelat
        System.out.println("in swapColors the new balloon hashCode is: " + balloon.hashCode());
        balloon.setColor("blue");
        //pot sa ii fac ce vreau de aici incolo, nu e obiectul cu care am intrat
        //asa ca nu imi pasa. nu o sa mi se dea valoarea lui
    }

    public static void main(String []args){
        Balloon red = new Balloon("red");
        Balloon blue = new Balloon("blue");

        swap(red,blue);
        System.out.println("red balloon: " + red.getColor());
        System.out.println("blue balloon: " + blue.getColor());

        swapColours(blue);
        System.out.println("blue balloon: " + blue.getColor());
    }
}
