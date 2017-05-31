package ar.edu.unlam.pb2.tp3.empresa;

import java.util.Date;

public class Gerente extends Empleado {
	
	private String cocheraAsignada;

	public String getCocheraAsignada() {
		return cocheraAsignada;
	}

	public void setCocheraAsignada(String cocheraAsignada) {
		this.cocheraAsignada = cocheraAsignada;
	}

	public Gerente(String nombre, Double salario, Date fechaNacimiento, String departamento, String cocheraAsignada) {
		super(nombre, salario, fechaNacimiento, departamento);
		
		this.cocheraAsignada = cocheraAsignada;
	}
	
	@Override
	public String brindarDetalles() {
		String detalles = "";
		
		detalles += super.brindarDetalles();
		detalles += "Cochera Asignada: " + getCocheraAsignada() + "\n";
		
		return detalles;
	}
}