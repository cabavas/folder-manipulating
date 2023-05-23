import java.io.File;
import java.util.Scanner;

public class FolderManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //List every folder on the path
        File[] folders = path.listFiles(File::isDirectory);
        for (File folder : folders) {
            System.out.println(folder);
        }

        //List all files on the path
        File[] files = path.listFiles(File::isFile);
        for(File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created succesfully: " + success);

        sc.close();
    }
}