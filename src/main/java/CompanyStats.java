public class CompanyStats {

    static final String IT = "it";
    static final String MANAGEMENT = "Management";
    static final String SUPPORT = "Support";

    static double employeesAverageWages(Employee[] employees) {
        double avg = 0;
        for (Employee employee : employees) {
            avg += employee.getWages();
        }
        return avg / employees.length;
    }

    static double lowestIncomeEmployee(Employee[] employees) {
        double wages = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getWages() < wages) {
                wages = employee.getWages();
            }
        }
        return wages;
    }

    static double highestIncomeEmployee(Employee[] employees) {
        double wages = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getWages() > wages) {
                wages = employee.getWages();
            }
        }
        return wages;
    }

    static int employeesInItDepartment(Employee[] employees) {
        int empCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(IT)) {
                empCount++;
            }
        }
        return empCount;
    }

    static int employeesInSupportDepartment(Employee[] employees) {
        int empCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(SUPPORT)) {
                empCount++;
            }
        }
        return empCount;
    }

    static int employeesInManagementDepartment(Employee[] employees) {
        int empCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(MANAGEMENT)) {
                empCount++;
            }
        }
        return empCount;
    }
}
