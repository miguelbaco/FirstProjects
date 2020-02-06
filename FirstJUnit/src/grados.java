import java.util.*;

public class grados {
	public static void main(String[] args) {
		grados g=new grados(0.0);
	}
	private double gradosCel;
	private double gradosFar;
	
	public grados() {
		
	}
	
	public grados(double g) {
		System.out.println("¿Estos son grados Celsius o Fahrenheit?");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if (s.equalsIgnoreCase("celsius")) {
			this.setGradosCel(g);
			this.celsiusfarenheit(g);
			System.out.println(g+" grados Celsius son: "+this.getGradosFar()+" grados Fahrenheit");
		}else if(s.equalsIgnoreCase("fahrenheit")) {
			this.setGradosFar(g);
			this.farenheitcelsius(g);
			System.out.println(g+" grados Fahrenheit son: "+this.getGradosCel()+" grados Celsius");
		}
		sc.close();
	}
	
	public double farenheitcelsius(double f) {
		this.setGradosCel(((f-32)*0.555555555));
		return ((f-32)*0.555555555);
	}
	
	public double celsiusfarenheit(double f) {
		this.setGradosFar(f*(1.8)+32);	
		return (f*(1.8)+32);
	}

	public double getGradosCel() {
		return gradosCel;
	}

	public double getGradosFar() {
		return gradosFar;
	}

	public void setGradosCel(double gradosCel) {
		this.gradosCel = gradosCel;
	}

	public void setGradosFar(double gradosFar) {
		this.gradosFar = gradosFar;
	}
}