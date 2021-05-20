import java.util.Scanner;
import java.util.ArrayList;
public class TareaUno {
public static void main(String[] args) {
	
	Scanner tec=new Scanner(System.in);
	int Array[], Numeros, aux;
	
	System.out.println("Ingresar la cantidad de elementos: ");
	Numeros=tec.nextInt();
	
	Array=new int[Numeros];
	System.out.println("Ingrese los Numeros necesarios: ");
	for(int i=0;i<Numeros;i++) {
		
		Array[i]=tec.nextInt();
	}
	
	for (int i = 0; i < Numeros; i++) {
		for (int j = 0; j < Numeros-1; j++) {
			if (Array[j]>Array[j+1]) {
				aux = Array[j];
				Array[j] = Array[j+1];
				Array[j+1] = aux;
			}
			
		}
	}
	System.out.print("Arreglo: (");
	for (int i = 0; i < Numeros; i++) {
		System.out.print(Array[i] +", ");
	}
	System.out.print(")");
}
}
