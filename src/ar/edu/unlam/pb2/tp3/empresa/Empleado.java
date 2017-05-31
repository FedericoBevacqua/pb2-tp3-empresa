package ar.edu.unlam.pb2.tp3.empresa;

import java.util.Date;

public abstract class Empleado {
	
	private String nombre;
	private Double salario;
	private Date fechaNacimiento;
	private String departamento;
	
	public Empleado(String nombre, Double salario, Date fechaNacimiento, String departamento) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.departamento = departamento;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
		
	public String brindarDetalles() {
		String detalles = "";
		
		detalles += "Tipo de Empleado: " + this.getClass().getSimpleName() + "\n";
		
		detalles += "Nombre: " + getNombre() + "\n";
		detalles += "Salario: " + getSalario() + "\n";
		detalles += "Fecha de Nacimiento: " + getFechaNacimiento() + "\n";
		detalles += "Departamento Designado: " + getDepartamento() + "\n";
		
		return detalles;
	}
}