package InjectionDependency.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController      //@RestController
public class Trainer {
	private Trainer tariner;

	public Trainer(Trainer tariner) {
		super();				//create Super()
		this.tariner = tariner;
	}
	
	@GetMapping("/teachnical")		//using @GetMapping
	public String teachnical()
	{
		tariner.teachnical();    //create object
		
		return "Training completed sucessfully!";
	}

}
