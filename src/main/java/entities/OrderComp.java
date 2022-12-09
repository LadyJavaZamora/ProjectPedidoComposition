package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderComp {
	//Exercicio de fixacao Composicao
	//static porque nao preciso instanciar um sdf para cada pedido, posso usar o mesmo
	  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	  
	//Atributos
	  private Date moment;
	  private OrderStatus status;
	  
	  //Implementa os relacionamentos
	  private Client client;
	  private List<OrdemItem> items = new ArrayList<OrdemItem>();
	
	//Construtores
	  public OrderComp () {
		  
	  }

	public OrderComp(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
    
	//Getters and setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	  
	//Outros métodos
	public void addItem(OrdemItem item) {
		items.add(item);
	}
   
	public void removeItem(OrdemItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrdemItem it : items) {
			sum = sum + it.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrdemItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
