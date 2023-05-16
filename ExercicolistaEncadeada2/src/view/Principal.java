package view;

import model.ILista;
import model.Lista;

public class Principal {
public static void main(String[] args)  {
	ILista listaA=new Lista();
	ILista listaB=new Lista();
	ILista listaI=new Lista();
	ILista listaU=new Lista();
	
	 try {
		 listaA.addFirst(3);
		 listaA.addLast(16);
		 listaA.add(5,1);
		 listaA.add(8,2);
		 listaA.add(12,3);
		 listaA.add(9,4);
		 listaA.add(7,5);
		 System.out.print("Lista A = ");
		 for(int i=0; i<7; i++) {
				 listaA.get(i);
				System.out.print(listaA.get(i) + " ");
		 }
		 listaB.addFirst(9);
		 listaB.addLast(7);
		 listaB.add(6,1);
		 listaB.add(2,2);
		 listaB.add(3,3);
		 System.out.print("Lista B =");
		 for(int i=0; i<5; i++) {
		System.out.print(listaB.get(i)+" ");
				
		 }
	
		for(int i=0; i<listaA.size();i++) 
		{
			for(int j=0;j<listaB.size();j++) 
			{
				if (listaA.get(i) == listaB.get(j)) {
					listaI.addFirst(listaA.get(i));
				}
		}
		}
		
		for(int i = 0; i< listaA.size(); i++) {
			listaU.addFirst(listaA.get(i));
		}
		System.out.println("          ");
		
		for(int i = 0; i< listaB.size(); i++) {
			listaU.addFirst(listaB.get(i));
		}
		System.out.println("    ");
		System.out.println("Lista A:");
		for(int i = 0; i< listaA.size(); i++) {
			System.out.print(listaA.get(i) + " - ");
		}
		System.out.println("         ");
		System.out.println("Lista B:");
		for(int i = 0; i< listaB.size(); i++) {
			System.out.print(listaB.get(i) + " - ");
		}
		System.out.println("          ");
		System.out.println("Uniao:");
		for(int i = 0; i< listaU.size(); i++) {
			System.out.print(listaU.get(i) + " - ");
		}
		System.out.println("            ");
		System.out.println("Intersecao:");
		for(int i = 0; i< listaI.size(); i++) {
			System.out.print(listaI.get(i) + " - ");
		}
		System.out.println();
		
	  }catch(Exception e) {
		 e.printStackTrace();
	 }
}
}


	


