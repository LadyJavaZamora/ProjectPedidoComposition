package entities;

public class OrdemItem {
	//Exercicio de fixacao Composicao
	//Atributos
	  private Integer quantity;
	  private Double  price;
	  
	  private ProductComp productComp;//Um OrderItem possui ProductComp
	  
	//Construtores
	  public OrdemItem () {
		  
	  }

	public OrdemItem(Integer quantity, Double price, ProductComp productComp) {
		this.quantity = quantity;
		this.price = price;
		this.productComp = productComp;
	}
	
	//Getters and Setters
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductComp getProductComp() {
		return productComp;
	}

	public void setProductComp(ProductComp productComp) {
		this.productComp = productComp;
	}
	  
	//Outros métodos  
	public double subTotal() {
		return price * quantity;		
	}
	
    @Override
    public String toString () {
    	return getProductComp().getName() 
    		   +", $"
    		   + String.format("%.2f", price)
    		   + ", Quantity: "
    		   + quantity
    		   + ", Subtotal: $"
    		   + String.format("%.2f", subTotal());
    }
}

