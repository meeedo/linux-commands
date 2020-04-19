package P;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Terminal terminal = new Terminal();
        /*
        String input ="";
        while(input != "exit") {
            Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        switch(input)
        {

        }
        }*/

       //Parser parser = new Parser();
       // terminal.cp("C:\\Users\\Admin\\Desktop\\file.txt", "C:\\Users\\Admin\\Desktop\\file1.txt");
       // terminal.mkdir("","directory name");
       // terminal.rm("C:\\Users\\Admin\\Desktop\\file.txt");
       // terminal.ls("C:\\Users\\Admin\\Desktop");
       // terminal.date();

        terminal.cat("C:\\Users\\Admin\\Desktop\\file.txt")
       // terminal.rmdir("","directory name");
       // terminal.ls("C:\\Users\\Admin\\Desktop\\n");
       // terminal.clear();
        //terminal.mv("C:\\Users\\Admin\\Desktop\\ehh.txt","C:\\FCI\\Third Year\\First Term\\Operating System-1\\Assignments\\ehh.txt");
    }

}
