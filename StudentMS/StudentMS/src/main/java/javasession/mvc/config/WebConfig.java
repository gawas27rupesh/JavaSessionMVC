package javasession.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javasession.mvc.service.StudentService;
import javasession.mvc.serviceImpl.StudentServiceImpl;


@Configuration
@EnableWebMvc
@ComponentScan({"javasession.mvc.config","javasession.mvc.controller","javasession.mvc.dao","javasession.mvc.entities"})
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");

        return resolver;
    }
    
    @Bean
    public StudentService getStudentservice(){
        return new StudentServiceImpl();
    }
}
