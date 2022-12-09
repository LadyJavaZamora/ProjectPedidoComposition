package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	//Exercicio de fixacao Composicao
	//static porque nao preciso instanciar um sdf para cada cliente, posso usar o mesmo
	  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
	
	//Atributos	
	  private String name;
	  private String email;
	  private Date   birthDate;
	  
	//Construtores
	  public Client () {
		  
	  }

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
 
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	  
	//Outros métodos
	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
	}

}
