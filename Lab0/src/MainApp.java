import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
		public static void main(String[] args) {
		      ApplicationContext context = 
		             new ClassPathXmlApplicationContext("beans.xml");

		      Greeting obj = (Greeting) context.getBean("greeter");

		      String name = obj.getGreeting();
		      System.out.println("Hello world from " +name+"!");
		   }
}
