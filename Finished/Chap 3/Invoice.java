public class Invoice
{
	private String part;
	private String description;
	private int quantity;
	private double price;
	private double invoiceAmount;
	
	
	public Invoice(String part,String description,int quantity,double price){
		this.part = part;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	
	}
	public void amount(int itemAmount){
		quantity = quantity + itemAmount;
	}
	public double getInvoiceAmount(){
		if (quantity < 0){
			quantity = 0;
		}
		if (price < 0){
			price = 0.0;
		}
		invoiceAmount =  quantity * price;	
		return invoiceAmount;
	}
	public void setPart(String part){
		this.part = part;
	}
	
	public String getPart(){
		return part;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
}