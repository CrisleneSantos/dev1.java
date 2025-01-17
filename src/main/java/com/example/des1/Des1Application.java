package com.example.des1;
import java.util.Locale;
import java.util.Scanner;
import com.Entities.Order;
import com.Services.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Des1Application {

	public static void main(String[] args) {
		SpringApplication.run(Des1Application.class, args);
		  Locale.setDefault(Locale.US);
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Dados do pedido: ");
		  System.out.printf("Código: ");
		  int codigo = sc.nextInt();
		  System.out.printf("Valor básico: ");
		  double valorPedido = sc.nextDouble();
		  System.out.printf("Porcentagem de desconto: ");
		  double porcentagem = sc.nextDouble();
		  
		  OrderService orderService  = new OrderService();

		  ShippingService shippingService = new ShippingService(0.0);
		  //SalaryService  salaryService = new SalaryService(taxService, pensionService);
		    
		  Order order= new Order(codigo, valorPedido, porcentagem);
		  double Total = orderService.Total(order, shippingService);
		  System.out.printf("Codigo do pedido: ", + codigo);
		  System.out.printf("Valor total: %.2f%n", + Total);

		  sc.close();
		  
		}

}
