package be.vdab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.vdab.dao.CreateDAOBeans;
import be.vdab.presentation.CreatePresentationBeans;
import be.vdab.presentation.PersoonViewer;
import be.vdab.services.CreateServiceBeans;

public class Main {

	public static void main(String[] args) {
		/*
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
			context.getBean(PersoonViewer.class).afbeelden();
		}*/
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CreateServiceBeans.class, CreateDAOBeans.class, CreatePresentationBeans.class)){
			context.getBean(PersoonViewer.class).afbeelden();
		}
	}

}
