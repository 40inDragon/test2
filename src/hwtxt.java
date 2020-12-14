import java.io.*;

public class hwtxt {

    public static void main(String[] args) {

        InputStream io;
        OutputStream ou;

        FileInputStream fis;
        FileOutputStream fos;

        try {
            fos = new FileOutputStream("text1.txt");
            PrintStream ps = new PrintStream(fos);
            ps.println("Я крайне плохо врубился в эту тему.");
            ps.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            fos = new FileOutputStream("text2.txt");
            PrintStream ps = new PrintStream(fos);
            ps.println("Надо будет наверстать в предстоящем отпуске.");
            ps.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
