package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.OrderComp;
import entities.ProductComp;
import entities.enums.OrderStatus;

public class ProgramPedidoComposition {
	//Exercicio de fixacao Composicao

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);//Instancia cliente
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());//Converte o string lido em status
		
        OrderComp order = new OrderComp(new Date(), status, client);//Instancia pedido
		
		System.out.print("How many items to this order? ");//Pega o numero de itens do pedido
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();//Pega dados do produto

			ProductComp product = new ProductComp(productName, productPrice);//Instancia um produto
			
			System.out.print("Quantity: ");//Quantos itens do produto
			int quantity = sc.nextInt();

			OrdemItem ordemItem = new OrdemItem(quantity, productPrice, product); //Instancia item de pedido

			order.addItem(ordemItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
