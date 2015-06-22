package com.multiplicatis.javaprogs;

public class Multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = args.length;
		int total = 1;
		
		for (int i = 0; i < n; i++) {			
			total *= Integer.parseInt(args[i]);			
		}
		
		if (n > 0) {
			System.out.println("Valor final: " + total);			
		} else {
			System.out.println("Introduza junto a nombre del programa una lista de valores enteros a multiplicar.");
		}
		
		
		return;

	}

}
