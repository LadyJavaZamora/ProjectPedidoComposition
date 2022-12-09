package entities;

public class ProductComp {
	//Exercicio de fixacao Composicao
	//Atributos
	 private String name;
	 private Double price;
	 
	//Construtores
	 ProductComp () {
		 
	 }

	public ProductComp(String name, Double price) {
		this.name = name;
		this.price = price;
	}
    
	//GetterandSetters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	 		

}
