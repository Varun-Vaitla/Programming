package electronics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileShop {
public static void main(String[] args) {
	ApplicationContext container=new AnnotationConfigApplicationContext(Myconfig.class);
	Mobile m=container.getBean(Mobile.class);
	m.call();
}
}
 