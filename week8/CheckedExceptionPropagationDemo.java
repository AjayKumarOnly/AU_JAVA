import java.io.*;

class FileProcessor {
    public void readFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        System.out.println("File content:");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

    public void processFile(String fileName) throws IOException {
        readFile(fileName);
    }

    public void handleFile(String fileName) throws IOException {
        processFile(fileName);
    }
}

public class CheckedExceptionPropagationDemo {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar S");
        System.out.println("Roll No : 2024503701");
        FileProcessor fp = new FileProcessor();

        try {
            fp.handleFile("sample.txt");
        }
        catch (IOException e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("Program continues...");
    }
}
