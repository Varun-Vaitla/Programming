package electronics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class Airtel implements Sim {

	public void call() {
		System.out.println("calling from  airtel sim");
		
	}

}
