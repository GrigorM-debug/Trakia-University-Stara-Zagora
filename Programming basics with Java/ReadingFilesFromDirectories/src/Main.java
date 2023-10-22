import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the directory path (or press Enter to use the default): ");
        Scanner scanner = new Scanner(System.in);
        String directoryPath = scanner.nextLine();

        if (directoryPath.isEmpty()) {
            directoryPath = System.getProperty("user.dir");
        }

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Listing of files and folders:");
            listFilesRecursively(directory, "");
        } else {
            System.out.println("Directory not found: " + directoryPath);
        }
    }

    public static void listFilesRecursively(File directory, String indent) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(indent + "Folder: " + file.getName());
                    listFilesRecursively(file, indent + "    ");
                } else {
                    System.out.println(indent + "File: " + file.getName());
                }
            }
        }
    }
}


