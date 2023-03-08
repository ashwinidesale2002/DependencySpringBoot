package InjectionDependency.Entity;

public class TrainerClass {
	private Subject subject;     //declare subject

	public TrainerClass() {
		super();
		
	}

	public TrainerClass(Subject subject) {
		super();
		this.subject = subject;
	}
	
	public Subject getSubject() {			//creating getter Setter method
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override							//@Override the method
	public String toString() {
		return "Trainer [subject=" + subject + "]";
	}

	public void teach ()
	{
		System.out.println("Trainer is teaching "+ subject.getName());
	}

}
