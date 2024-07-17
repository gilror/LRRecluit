package com;

public abstract class Empleado {
	String nombre;
    double salario;
    int anosSevicio;
    
    public Empleado() {
    	
    }

    public Empleado(String nombre, double salario, int anosSevicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.anosSevicio = anosSevicio;
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAnosSevicio() {
		return anosSevicio;
	}

	public void setAnosSevicio(int anosSevicio) {
		this.anosSevicio = anosSevicio;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + ", anosSevicio=" + anosSevicio + "]";
	}

	public abstract double calculateBono();
}
