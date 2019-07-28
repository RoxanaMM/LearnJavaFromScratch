package basicsTesting.checkedUncheckedExceptions;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckedExceptionsTesting {
    public static void main(String... args) {
        try {
            String fileName = "C:\\Users\\Roxi\\Desktop\\roxi.txt";
            Path path = Paths.get(fileName);
            byte[] bytes = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Noting to be done");
        }
    }
}
