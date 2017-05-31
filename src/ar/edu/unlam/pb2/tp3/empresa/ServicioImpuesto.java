package ar.edu.unlam.pb2.tp3.empresa;

public class ServicioImpuesto {
	
	public Double obtenerImpuesto(Empleado empleado) {
		Double impuesto = 0D;
		Double salario = empleado.getSalario();

		if(salario >= 9000D) {
			impuesto = salario * 0.15;
		} else if(salario >= 5000D) {
				impuesto = salario * 0.1;
			} else {
					impuesto = salario * 0.05;
		}
		return impuesto;
	}
}