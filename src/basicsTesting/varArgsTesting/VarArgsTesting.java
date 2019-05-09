package basicsTesting.varArgsTesting;

import java.util.Vector;

public class VarArgsTesting {

    public static int[] myVector,nonVector;

    public static void getValue(int ...a){

        System.out.println(a.length);
        for (int i : a){
            System.out.println(i);
        }
    }

    //keep in mind that varargs must always be the last in the list of params
    public static void main(String ...args){
      //  getValue(2,3,4);
        myVector = new int[0];
        nonVector = new int[2];
        System.out.println(myVector.length);
        myVector[0] = 1;


        nonVector[0] = 1;
        getValue(myVector);
    }
}
