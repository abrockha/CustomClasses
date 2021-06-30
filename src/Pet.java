
public class Pet {
	private String name;
	private int age;
	private String location;
	private String type;
	
	public Pet() {
		this.name = "";
		this.age = 0;
		this.location = "";
		this.type = "";
	}
	
	public Pet(String name) {
		this.name = name;
		this.age = 0;
		this.location = "";
		this.type = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}
	
	
}
