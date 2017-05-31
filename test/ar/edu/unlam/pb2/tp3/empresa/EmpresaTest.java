package ar.edu.unlam.pb2.tp3.empresa;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import junit.framework.Assert;

public class EmpresaTest {

	@Test
	public void empleadoTest() {
		
		Empleado unEmpleado = new Gerente("Roman", 2500.00, Date.valueOf("1991-01-01"), "Departamento1", "Estacionamiento1");
		
		System.out.println(unEmpleado.brindarDetalles());
	}
	
	@Test
	public void impuestoTest(){
		ServicioImpuesto unServicioImpuesto = new ServicioImpuesto();
		
		Empleado unEmpleado = new Gerente("Roman", 2500.00, Date.valueOf("1991-01-01"), "Departamento2", "Estacionamiento1");
		
		Double valorEsperado = 125D;
		Double valorObtenido = unServicioImpuesto.obtenerImpuesto(unEmpleado);
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
		Empleado dosEmpleado = new Director("Jose", 12000.00, Date.valueOf("1981-01-01"), "Departamento3", "Estacionamiento2", 525D);
		
		valorEsperado = 1878.75D;
		valorObtenido = unServicioImpuesto.obtenerImpuesto(dosEmpleado);
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
		Empleado tresEmpleado = new Ingeniero("Pablo", 5500.00, Date.valueOf("1988-01-01"), "Departamento4");
		
		valorEsperado = 550D;
		valorObtenido = unServicioImpuesto.obtenerImpuesto(tresEmpleado);
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}