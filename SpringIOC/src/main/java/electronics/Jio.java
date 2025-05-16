package electronics;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim{

	public void call() {
		System.out.println("calling from jio sim");
	}
	

}
