package basicsTesting.StringHashCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex implements Cloneable{
    private int[] data;

    public Ex(int[]values){
        data = values;
    }

    public Ex(int[] values, String deepCopy){
        data = new int[values.length];
        for(int i =0;i< values.length;i++){
            data[i] = values [i];
        }
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }
}
