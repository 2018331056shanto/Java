package SingleResponsibility.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:10:24 AM</p>
 */
public class EmployeeReportGenerator {

    public String generateReport(Employee employee){
        return String.format("Employee name : %s Employee Salary : %f",employee.getName(),new PayCalculator().calculatePay(employee));
    }
}
