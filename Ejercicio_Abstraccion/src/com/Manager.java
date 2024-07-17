package com;

public class Manager extends Empleado{
	private int evaluacionDesempeno;
	
	public Manager() {
		
	}
	
	public Manager(String nombre, double salario, int anosServicio, int evaluacionDesempeno) {
		super(nombre, salario, anosServicio);
		this.evaluacionDesempeno = evaluacionDesempeno;
	}

	@Override
	public double calculateBono() {
		// TODO Auto-generated method stub
		
		double bonoBase = getSalario() * 0.1; 
		if (getAnosSevicio() >= 5) {
            bonoBase += 2000; // Bono adicional para más de 5 años de servicio
        }
		
		if (evaluacionDesempeno >= 8) {
			bonoBase*= 1.2;
		}else {
			bonoBase *=0.8;
		}
		return bonoBase;
	}
}