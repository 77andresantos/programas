import java.util.Scanner;
public class retangulo {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
					
	double base, altura, area, perimetro, diagonal;
		
	System.out.print("Base do retangulo: ");
	base = sc.nextDouble();
	System.out.print("Altura do retangulo: ");
	altura = sc.nextDouble();
	area = base * altura;
		
	System.out.printf("Área = %.2f\n", area);
	perimetro = 2 * (base + altura);
	System.out.printf("Perimetro = %.2f\n", perimetro);
	diagonal = Math.sqrt(base * base + altura * altura);
	System.out.printf("DIAGONAL = %.2f\n", diagonal);
		
	sc.close();
	}
}