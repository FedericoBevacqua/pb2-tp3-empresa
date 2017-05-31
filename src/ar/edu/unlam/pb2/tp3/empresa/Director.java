package ar.edu.unlam.pb2.tp3.empresa;

import java.util.Date;

public class Director extends Empleado {
	
	private String cocheraAsignada;
	private Double gastosVehiculo;

	public Director(String nombre, Double salario, Date fechaNacimiento, String departamento, String cocheraAsignada, Double gastosVehiculo) {
		super(nombre, salario, fechaNacimiento, departamento);
		
		this.cocheraAsignada = cocheraAsignada;
		this.gastosVehiculo = gastosVehiculo;
	}
	
	public String getCocheraAsignada() {
		return cocheraAsignada;
	}

	public void setCocheraAsignada(String cocheraAsignada) {
		this.cocheraAsignada = cocheraAsignada;
	}

	public Double getGastosVehiculo() {
		return gastosVehiculo;
	}

	public void setGastosVehiculo(Double gastosVehiculo) {
		this.gastosVehiculo = gastosVehiculo;
	}

	@Override
	public String brindarDetalles() {
		
		String detalles = super.brindarDetalles();
		
		detalles += "Cochera Asignada: " + getCocheraAsignada() + "\n";
		detalles += "Extra para gastos del vehículo: " + getGastosVehiculo() + "\n";
		
		return detalles;
	}
	
	@Override
	public Double getSalario() {
		return super.getSalario() + getGastosVehiculo();
	}
}