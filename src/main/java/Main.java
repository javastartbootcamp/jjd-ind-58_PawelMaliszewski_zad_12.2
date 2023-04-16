import employee.Employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("employees.csv");
        Employee[] employees = Company.employeeListFromFile("employees.csv");
        boolean statsFileCreated = false;
        if (file.exists()) {
            File stats = new File("stats.txt");
            statsFileCreated = stats.createNewFile();
            FileWriter fileWriter = new FileWriter(stats);
            fileWriter.write("Średnia wypłata: " + CompanyStats.employeesAverageWages(employees) + "\r");
            fileWriter.write("Minimalna wypłata: " + CompanyStats.lowestIncomeEmployee(employees) + "\r");
            fileWriter.write("Maksymalna wypłata: " + CompanyStats.highestIncomeEmployee(employees) + "\r");
            fileWriter.write("Liczba pracowników IT: " + CompanyStats.employeesInItDepartment(employees) + "\r");
            fileWriter.write("Liczba pracowników Support: " + CompanyStats.employeesInSupportDepartment(employees) + "\r");
            fileWriter.write("Liczba pracowników Management: " + CompanyStats.employeesInManagementDepartment(employees) + "\r");
            fileWriter.close();
        }
        if (statsFileCreated) {
            System.out.println("Utworzono plik stats.txt");
        }
    }
}
