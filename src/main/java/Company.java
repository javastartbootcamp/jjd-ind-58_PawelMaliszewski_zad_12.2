import employee.Employee;
import employee.It;
import employee.Management;
import employee.Support;

import java.io.*;
import java.util.Scanner;

public class Company {
    static Employee[] employeeListFromFile(String fileName) throws IOException {
        int numberOfEmployees = countLines(fileName);
        Employee[] employees = new Employee[numberOfEmployees];
        var fileReader = new BufferedReader(new FileReader(fileName));
        for (int i = 0; i < employees.length; i++) {
            employees[i] = getEmployeeFromFile(fileReader.readLine());
        }
        return employees;
    }

    private static Employee getEmployeeFromFile(String employeeInfo) {
        String[] split = employeeInfo.split(";");
        if (split[3].equalsIgnoreCase(CompanyStats.IT)) {
            return new It(split[0], split[1], split[2], Double.parseDouble(split[4]));
        } else if (split[3].equalsIgnoreCase(CompanyStats.SUPPORT)) {
            return new Support(split[0], split[1], split[2], Double.parseDouble(split[4]));
        }
        return new Management(split[0], split[1], split[2], Double.parseDouble(split[4]));
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNextLine()) {
            sc.nextLine();
            lines++;
        }
        return lines;
    }
}
