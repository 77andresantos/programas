import java.util.Scanner;
public class calculadora {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
	double n1,n2;
	int op;		
	while (true) {
	System.out.println("1-Soma\n2-Subtra��o\n3-Multiplica��o\n4-Divis�o\n5-Sair");
	op = entrada.nextInt();
	if (op==5)
		break;
	if (op<1 || op>5) {
		System.out.println("Op��o do menu inv�lida");
		continue;
	}
	System.out.println("Digite dois n�meros");
	n1 = entrada.nextDouble();
	n2 = entrada.nextDouble();
	switch (op) {
	case 1 : System.out.println("Soma = "+ (n1+n2));
			break;
		case 2 : System.out.println("Subtra��o = "+ (n1-n2));
			break;
		case 3 : System.out.println("Multiplica��o = "+ (n1*n2));
			break;	
		case 4 : 
			if (n2 == 0) { 
			System.out.println("N�O FOI POSS�VEL REALIZAR A OPERA��O");
			break;
			} 
			else { 
				System.out.println("Divis�o = "+ (n1/n2));
			break;
				}
			}
		System.out.println();
		}
	entrada.close();
	}	
}