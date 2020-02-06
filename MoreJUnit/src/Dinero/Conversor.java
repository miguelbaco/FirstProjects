package Dinero;

import java.util.Scanner;

public class Conversor {
	
	double euros = 0;
	double dolares = 0;
	
	static public void main(String[] arg) {
		Conversor conver = new Conversor();
		
		System.out.println(conver.toString());
	}
	
	public Conversor() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Convertir a: (euros o dolares)");
		String tipo = sc.nextLine();
		
		System.out.println("Introduce dinero a convertir: ");
		String valorlinea = sc.nextLine();
		Double valor = Double.parseDouble(valorlinea);
		
		switch(tipo) {
		case "euros":
			dolares = valor;
			euros = dollar2euro(valor);
			break;
		case "dolares":
			euros = valor;
			dolares = euro2dollar(valor);
			break;
		}
		sc.close();
	}
	
	public Conversor(double euros, double dolares) {
		this.euros = euros;
		this.dolares = dolares;
	}

	public double getEuros() {
		return euros;
	}

	public void setEuros(double euros) {
		this.euros = euros;
	}

	public double getDolares() {
		return dolares;
	}

	public void setDolares(double dolares) {
		this.dolares = dolares;
	}
	
	public String toString() {
		return "Dolares: " + dolares + ", euros: " + euros; 
	}
	
	public double dollar2euro(double dinero) {
		dinero = dinero * 0.91;
		return dinero;
	}
	
	public double euro2dollar(double dinero) {
		dinero = dinero / 0.91;
		return dinero;
	}

}
