package references.weakReference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class WeakReferenceTesting {

    public static void main(String...args){

        String ana = new String ("ANA");
        System.out.println(ana.hashCode());

        System.gc();
        System.out.println(ana.hashCode());
//
//        System.out.println(ana);
//        ana = null;
//
//        System.gc();
//        System.out.println(ana);
        WeakReference<String> weakReferenceToAna = new WeakReference<String>(ana);
        ana = null;
        System.gc();
        System.out.println("Hi there " + weakReferenceToAna.get());


        ana = new String ("ANA");
        SoftReference<String> softReference = new SoftReference<String>(ana);
        ana = null;
        System.gc();
        System.out.println(softReference.get());


    }

}
