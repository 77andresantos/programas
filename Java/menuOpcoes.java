import java.util.Scanner;
public class menuOpcoes {
	
	public static void main(String[] args) {
				
	Scanner sc = new Scanner(System.in);
			
	double n1, n2;
	int menu;
		
	while (true) {
	System.out.println("1-Média entre os números digitados\n2-Diferença do maior "
	+ "pelo menor\n3-Multiplicação dos números digitados\n4-Divisão do primeiro pelo segundo\n5-Sair");
	menu = sc.nextInt();
	if (menu==5) {
		System.out.println("Menu fechado");
		break;
	}
	if (menu<1 || menu>5) {
		System.out.println("OPÇÃO INVÁLIDA");
		continue;
	}
	System.out.println("Digite dois números");
	n1 = sc.nextDouble();
	n2 = sc.nextDouble();
	switch (menu) {
		case 1 : System.out.println("Média: "+ (n1+n2)/2);				
			break;
		case 2 : 
			if (n2 > n1) {
			System.out.println("Diferença: "+ (n2-n1));
			break;
			}
			else {
				System.out.println(n1-n2);
			break;			
			}
		case 3 : System.out.println("Multiplicação: "+ (n1*n2));
			break;
		case 4 : 
			if (n2 == 0) {
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
			break;
			}
			else {
			System.out.println("Divisão: "+ (n1/n2));
			break;						
				}									
			}
		System.out.println();
		}		
	}
}