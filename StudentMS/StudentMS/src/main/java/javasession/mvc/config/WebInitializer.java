package javasession.mvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class WebInitializer implements WebApplicationInitializer {

		public void onStartup(ServletContext servletContext) throws ServletException {
		 AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
	        applicationContext.register(WebConfig.class);

	        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher", new DispatcherServlet(applicationContext));
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
	}
	
}

//public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
//
//	
//	protected Class<?>[] getRootConfigClasses() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	protected Class<?>[] getServletConfigClasses() {
//		Class[] config = {WebConfig.class};
//		return config;
//	}
//
//	protected String[] getServletMappings() {
//		String[] mapping = {"/"};
//		return mapping;
//	}