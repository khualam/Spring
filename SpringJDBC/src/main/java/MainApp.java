import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.SpringJDBCConfig;
import com.spring.employee.EmployeeDAO;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringJDBCConfig.class);
 
        EmployeeDAO empDAO = applicationContext.getBean(EmployeeDAO.class);
 
        String empName = empDAO.getEmployee(1);
 
        System.out.println("Employee name is " + empName);
        
        System.out.println("------Records Creation--------" );
        empDAO.insert(2, 22, "Roshani");
        empDAO.insert(3, 23, "Abc");
        empDAO.insert(4, 21, "PQR");
 
        applicationContext.close();
	}

}
