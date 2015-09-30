package be.vdab;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
			
			context
				.getBean(PersoonViewer.class)
				.afbeelden(	
						Arrays.asList(	new Persoon(1, "Frederick", "Dubois", 2), 
										new Persoon(2, "Jean", "Dubois", 0), 
										new Persoon(3, "mavick", "Dubois", 4), 
										new Persoon(4, "slim", "Dubois", 3), 
										new Persoon(5, "bouton", "Dubois", 1)));
		}
	}

}
