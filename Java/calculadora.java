import java.util.Scanner;
public class calculadora {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
		
	double n1,n2;
	int op;		
	while (true) {
	System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair");
	op = entrada.nextInt();
	if (op==5)
		break;
	if (op<1 || op>5) {
		System.out.println("Opção do menu inválida");
		continue;
	}
	System.out.println("Digite dois números");
	n1 = entrada.nextDouble();
	n2 = entrada.nextDouble();
	switch (op) {
	case 1 : System.out.println("Soma = "+ (n1+n2));
			break;
		case 2 : System.out.println("Subtração = "+ (n1-n2));
			break;
		case 3 : System.out.println("Multiplicação = "+ (n1*n2));
			break;	
		case 4 : 
			if (n2 == 0) { 
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
			break;
			} 
			else { 
				System.out.println("Divisão = "+ (n1/n2));
			break;
				}
			}
		System.out.println();
		}
	entrada.close();
	}	
}