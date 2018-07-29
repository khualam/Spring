
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.websystique.spring.Communication;
 
public class AppMain {
    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        Communication app = (Communication)context.getBean("communication");
        app.communicate();
        
        /* ActiveMQMessaging am=new ActiveMQMessaging();
         * Communication app=new Communication();
         * 
         * 
        	        //app.setMessaging(am);
        */
        
        
           }
}