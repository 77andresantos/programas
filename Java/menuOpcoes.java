import java.util.Scanner;
public class menuOpcoes {
	
	public static void main(String[] args) {
				
	Scanner sc = new Scanner(System.in);
			
	double n1, n2;
	int menu;
		
	while (true) {
	System.out.println("1-M�dia entre os n�meros digitados\n2-Diferen�a do maior "
	+ "pelo menor\n3-Multiplica��o dos n�meros digitados\n4-Divis�o do primeiro pelo segundo\n5-Sair");
	menu = sc.nextInt();
	if (menu==5) {
		System.out.println("Menu fechado");
		break;
	}
	if (menu<1 || menu>5) {
		System.out.println("OP��O INV�LIDA");
		continue;
	}
	System.out.println("Digite dois n�meros");
	n1 = sc.nextDouble();
	n2 = sc.nextDouble();
	switch (menu) {
		case 1 : System.out.println("M�dia: "+ (n1+n2)/2);				
			break;
		case 2 : 
			if (n2 > n1) {
			System.out.println("Diferen�a: "+ (n2-n1));
			break;
			}
			else {
				System.out.println(n1-n2);
			break;			
			}
		case 3 : System.out.println("Multiplica��o: "+ (n1*n2));
			break;
		case 4 : 
			if (n2 == 0) {
			System.out.println("N�O FOI POSS�VEL REALIZAR A OPERA��O");
			break;
			}
			else {
			System.out.println("Divis�o: "+ (n1/n2));
			break;						
				}									
			}
		System.out.println();
		}		
	}
}