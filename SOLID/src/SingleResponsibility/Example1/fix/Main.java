package SingleResponsibility.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:10:28 AM</p>
 */
public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Shanto",10.2);

        PayCalculator payCalculator=new PayCalculator();
        System.out.println(payCalculator.calculatePay(employee));

        EmployeeRepository eRepository=new EmployeeRepository();
        System.out.println(eRepository.save(employee));

        EmployeeReportGenerator eReportGenerator=new EmployeeReportGenerator();
        System.out.println(eReportGenerator.generateReport(employee));
    }
}
