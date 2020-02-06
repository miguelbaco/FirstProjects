package Romanos;

import java.util.Scanner;

public class Romano {
	
	double decimal = 0;
	String romano = "";
	
	static public void main(String[] args) {
		Romano r = new Romano();
		System.out.println(r.toString());
	    }
	
	public Romano(double decimal, String romano) {
		this.decimal = decimal;
		this.romano = romano;
	}
	
	public Romano() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor: ");
		String valor = sc.nextLine();
		
		if(esdecimal(valor)) {
			decimal = Double.parseDouble(valor);
			romano = dec2roman(decimal);
	    } else {
	    	romano = valor;
			decimal = roman2dec(romano);
	    }
		sc.close();
	}
	
	public String toString() {
		return "Decimal: " + decimal + ", romano: " + romano; 
	}
	
	public double getDecimal() {
		return decimal;
	}

	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}

	public String getRomano() {
		return romano;
	}

	public void setRomano(String romano) {
		this.romano = romano;
	}

	public double roman2dec(String romano) {
		
		 char Rom[]= {' ','I','V','X','L','C','D','M'};

	        int valor[] = {0,1,5,10,50,100,500,1000};

	        double ant = 0;

	        double suma = 0;

	        for(int i = 0; i < romano.length(); i++){

	               char letra = romano.charAt(i);

	                for(int j = 0; j < Rom.length; j++){

	                    if(letra == Rom[j]){                

	                                suma = suma + valor [j];

	                            if( ant < valor[j]){

	                                    suma = suma - ant*2 ;

	                                    ant = valor[j];

	                            }else {

	                        ant = valor[j];

	                            }

	                    }              

	                }

	        }

	        return suma;    
		
	}
	
	public String dec2roman(double numero) {
		double i, miles, centenas, decenas, unidades;
	      String romano = "";
	      
	      miles = numero / 1000;
	      centenas = numero / 100 % 10;
	      decenas = numero / 10 % 10;
	      unidades = numero % 10;

	      for (i = 1; i <= miles; i++) {
	             romano = romano + "M";
	      }

	      if (centenas == 9) {
	          romano = romano + "CM";
	      } else if (centenas >= 5) {
	                     romano = romano + "D";
	                     for (i = 6; i <= centenas; i++) {
	                            romano = romano + "C";
	                     }
	      } else if (centenas == 4) {
	                      romano = romano + "CD";
	      } else {
	                  for (i = 1; i <= centenas; i++) {
	                         romano = romano + "C";
	                  }
	      }

	      if (decenas == 9) {
	           romano = romano + "XC";
	      } else if (decenas >= 5) {
	                      romano = romano + "L";
	                      for (i = 6; i <= decenas; i++) {
	                            romano = romano + "X";
	                      }
	      } else if (decenas == 4) {
	                      romano = romano + "XL";
	      } else {
	                    for (i = 1; i <= decenas; i++) {
	                           romano = romano + "X";
	                    }
	      }

	      if (unidades == 9) {
	           romano = romano + "IX";
	      } else if (unidades >= 5) {
	                      romano = romano + "V";
	                      for (i = 6; i <= unidades; i++) {
	                             romano = romano + "I";
	                      }
	      } else if (unidades == 4) {
	                      romano = romano + "IV";
	      } else {
	                  for (i = 1; i <= unidades; i++) {
	                         romano = romano + "I";
	                  }
	      }
	      return romano;
	}
	
	public static boolean esdecimal(String cadena) {

		if(cadena.matches("[A-Z].*")) {
			return false;
		} else {
			return true;
		}
    }
}
