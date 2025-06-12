package ch08;

public class Product {
	private String id;
	private String name;
	private String co;
	private int price;
	private String date;

	// 생성자 선언
	public Product(String id, String name, String co, int price, String date) {
		this.id = id;
		this.name = name;
		this.co = co;
		this.price = price;
		this.date = date;
	}

	// Generate getter / setter 사용
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
