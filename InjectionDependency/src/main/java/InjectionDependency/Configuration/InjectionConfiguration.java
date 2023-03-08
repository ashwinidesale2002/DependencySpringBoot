package InjectionDependency.Configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import InjectionDependency.Controller.Trainer;
import InjectionDependency.Entity.Subject;
import InjectionDependency.Entity.TrainerClass;

@Configuration							//using @Configuraton it's configuration class ,
										//indicate the @bean define methods

public class InjectionConfiguration {
	@Bean
	public Subject subject ()
	{
       return new Subject ("Java");
  
    }
	
	@Bean				//is using implement to inject in component classes
	public TrainerClass trainer ()
	{
       return new TrainerClass(subject());
  
    }

}
