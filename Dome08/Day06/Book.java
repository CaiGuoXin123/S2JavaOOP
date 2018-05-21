package Day06;

public class Book {
    public String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int Price;
	public Book(String name,int Price){
		this.name=name;
		this.Price=Price;
	}
}
