package Entity;

public class Piatto {

	private long id;
	private String name;
	private String description;
	private float price;
	private String piattoType;

	public long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public float getPrice() {
		return this.price;
	}

	public String getType() {
		return this.piattoType;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * 
	 * @param piattoType
	 */
	public void setType(String piattoType) {
		this.piattoType = piattoType;
	}

}