package Vehical;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Sony implements MusicSystem {

	public void play() {
	System.out.println("playing music from sony.........");
		
	}

}
