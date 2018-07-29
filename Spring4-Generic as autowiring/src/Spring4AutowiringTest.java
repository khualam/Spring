// Use Spring release jar files
// If you use spring (M2), It will throw exception
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javapapers.spring4.service.AlphabetService;
import com.javapapers.spring4.service.NumberService;

public class Spring4AutowiringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		NumberService numService = (NumberService)context.getBean("numberService");
		System.out.println(numService.getNumber());
		System.out.println(numService.getNumber());
		System.out.println(numService.getNumber());
		
		AlphabetService alphabetService = (AlphabetService)context.getBean("alphabetService");
		System.out.println(alphabetService.getAlphabet());
		System.out.println(alphabetService.getAlphabet());
		System.out.println(alphabetService.getAlphabet());
	}
}
