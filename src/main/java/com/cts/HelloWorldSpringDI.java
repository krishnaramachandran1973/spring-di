package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.cts.message.MessageRenderer;

public class HelloWorldSpringDI {

	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		
		MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
		renderer.render();*/

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:/app-context.xml");
		ctx.refresh();
		MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
		renderer.render();
		ctx.close();
	}
}
