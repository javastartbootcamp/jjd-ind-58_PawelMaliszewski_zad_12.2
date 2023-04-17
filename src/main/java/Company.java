import java.io.*;
import java.util.Scanner;

public class Company {
    private static String fileName;

    static Employee[] employeesListFromFile(String fileName) throws IOException {
        int numberOfEmployees = countLines(fileName);
        Employee[] employees = new Employee[numberOfEmployees];
        try (var fileReader = new BufferedReader(new FileReader(fileName))
        ) {
            for (int i = 0; i < employees.length; i++) {
                employees[i] = getEmployeeFromFile(fileReader.readLine());
            }
            return employees;
        }
    }

    private static Employee getEmployeeFromFile(String employeeInfo) {
        String[] split = employeeInfo.split(";");
        return new Employee(split[0], split[1], split[2], split[3], Double.parseDouble(split[4]));
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                lines++;
            }
            return lines;
        }
    }
}
