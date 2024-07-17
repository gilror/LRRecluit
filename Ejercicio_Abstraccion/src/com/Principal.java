package com;

public class Principal {
	public static void main(String[] args) {
		Manager manager = new Manager("Ana", 60000, 5, 9);
		
	    double bonus = manager.calculateBono();
	    
	    System.out.println("Bono del gerente " + manager.getNombre() + ": $" + bonus);
	}
}
