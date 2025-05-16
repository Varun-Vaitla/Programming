package Vehical;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Jbl implements MusicSystem {

	public void play() {
		System.out.println("playing music from jbl........");
		
	}

}
