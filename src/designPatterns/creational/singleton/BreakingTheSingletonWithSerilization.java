package designPatterns.creational.singleton;

import java.io.*;

public class BreakingTheSingletonWithSerilization {

    public static void main(String[] args) {

        AlmostPerfectSingleton singleton = AlmostPerfectSingleton.getInstance();
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        System.out.println(singleton.hashCode());

        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\Roxi\\Desktop\\Grecia.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singleton);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        AlmostPerfectSingleton singletonRead = AlmostPerfectSingleton.getInstance();
        try{
            fileInputStream = new FileInputStream("C:\\Users\\Roxi\\Desktop\\Grecia.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            singletonRead = (AlmostPerfectSingleton) objectInputStream.readObject();

            System.out.println(singletonRead.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //protected from clone()
        Object almostPerfectSingleton = null;
        try {
            almostPerfectSingleton = singleton.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(almostPerfectSingleton);


    }
}
