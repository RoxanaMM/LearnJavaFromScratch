package basicsTesting.writeToFile;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFileMainTesting {

    public static void whenWriteStringUsingBufferedWritter_thenCorrect(String fileName)
            throws IOException {
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(str);

        writer.close();
    }

    public static void main(String...args){
        try {
            whenWriteStringUsingBufferedWritter_thenCorrect("C:\\Users\\RoxanaM\\Desktop\\hi.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
