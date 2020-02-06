import java.util.Scanner;

public class CalculadoraED {
	static public void main(String[] arg) {
		String op;
		System.out.println("Elige un tipo de operacion: + Suma, - Resta, * Multiplicacion, / Division, pot Potencia");
		Scanner sc = new Scanner(System.in);
		op = sc.nextLine();
		
		int op1, op2;
		int result = 0;
		
		switch(op) {
		case "+": System.out.println("Primer operando: ");
		        op1 = sc.nextInt();
		        System.out.println("Segundo operando: ");
		        op2 = sc.nextInt();
		        if((op1 % 1 != 0) || (op2 % 1 != 0)) {
		        	System.out.println("No has dado numeros enteros");
		        } else
		        	result = op1 + op2;
	        	System.out.println(op1 + " + " + op2 + " = " + result);
		        	
			    break;
			    
		case "-": System.out.println("Primer operando: ");
        		op1 = sc.nextInt();
        		System.out.println("Segundo operando: ");
        		op2 = sc.nextInt();
        		if (op2 > op1) {
        			System.out.println("El segundo operando es mayor que el primero");
		        	System.out.println("Primer operando: ");
			        op1 = sc.nextInt();
			        System.out.println("Segundo operando: ");
			        op2 = sc.nextInt();
			        if (op2 > op1) {
			        	System.out.println("Has vuelto a hacerlo");
			        } else {
			        result = op1 - op2;
			        System.out.println(op1 + " - " + op2 + " = " + result);
			        }
        		} else {
        			result = op1 - op2;
        		    System.out.println(op1 + " - " + op2 + " = " + result);
        		}
		        break;
		        
		case "*": System.out.println("Primer operando: ");
				op1 = sc.nextInt();
				System.out.println("Segundo operando: ");
				op2 = sc.nextInt();
				result = op1 * op2;
				System.out.println(op1 + " * " + op2 + " = " + result);
				break;
				
		case "/": System.out.println("Dividendo: ");
				op1 = sc.nextInt();
				System.out.println("Divisor: ");
				op2 = sc.nextInt();
				System.out.print(op1);
				while (op1 >0) {
					  result++;
					  op1 = op1-op2;								
					} 
				System.out.println(" / " + op2 + " = " + result);
		        break;
		        
		case "pot": result = 1;
				System.out.println("Base: ");
				op1 = sc.nextInt();
				System.out.println("Exponente: ");
				op2 = sc.nextInt();
				
				for (int i=0; i < op2; i++) {
					result = result * op1;
				}
				System.out.println(op1 + " ^ " + op2 + " = " + result);
		        break;
		        
		default: System.out.println("No has introducido una operacion permitida");
				break;
		}
	sc.close();	
	}
}