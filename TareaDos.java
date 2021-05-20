import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;
public class TareaDos {
public static void main(String[] args) {
	Scanner tec=new Scanner(System.in);
	int nELemntos=12,cont=1,cont1=0,cont2=0,cont3=0,Aux=0;
	double Array[],Array1[],Array2[],Nfinal,Nproyect;
	Array=new double[nELemntos];
	Array1=new double[4];
	Array2=new double[2];
	
	for (int i = 0; i < nELemntos; i++) {
		
		Array[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Nota numero "+cont+": "));
		cont++;
	}
	
	for (int i = 0; i < (4)-1; i=i+3) {
			Array1[cont1]=(Array[i]+Array[i+1]+Array[i+2])/3;
			cont1++;
			
			
		
	}
	for (int i = 0; i < (2)-1; i++) {
			Array2[cont2]=(Array1[i]+Array1[i+1])/2;
			cont2++;
		}
	
	Nfinal=(Array2[0]+Array2[1])/2;
	System.out.println("El promedio final de todas las notas dio como resultado: "+Nfinal);
	
	do {
		Aux++;
	}while((Aux+Nfinal)/2!=8);
	
	System.out.println("La nota necesaria del proyecto para pasar es de: "+Aux);
	
	
	
	
}
}
