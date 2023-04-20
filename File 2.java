import java.io.File;
import java.io.IOException;

class File2{
    public static void main(String[] args) {
        try {
            File myObj = new File("emplye.java");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
