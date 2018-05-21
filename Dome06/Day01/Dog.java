package Day01;

public class Dog {
	private String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStain() {
		return stain;
	}
	public void setStain(String stain) {
		this.stain = stain;
	}
	private String stain;
    public Dog(String name,String stain){
    	this.name=name;
    	this.stain=stain;
    }
    }