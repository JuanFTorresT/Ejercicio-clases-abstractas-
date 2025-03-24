package logica;

import java.time.LocalDate;

public class EmpleadoAsalariado extends Empleado{
	
	private double sueldoBase;

	public EmpleadoAsalariado() {
		super();
		sueldoBase=0;
		
	}
	
	public EmpleadoAsalariado(String dni, String nombre, String apellidos, int año, double sueldoBase) {
		super(dni, nombre, apellidos, año);
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String getSalario() {
		int hoy = LocalDate.now().getYear();
		if ((hoy-getAñoIngresoEmpresa())<2) {
			sueldoBase += 0;
		}else if ((hoy-getAñoIngresoEmpresa()) > 1 && (hoy-getAñoIngresoEmpresa()) < 4) {
			sueldoBase += sueldoBase*0.07;
		}else if ((hoy-getAñoIngresoEmpresa()) > 3 && (hoy-getAñoIngresoEmpresa()) < 9) {
			sueldoBase += sueldoBase*0.11;
		}else if ((hoy-getAñoIngresoEmpresa()) > 8 && (hoy-getAñoIngresoEmpresa()) < 16) {
			sueldoBase += sueldoBase*0.17;
		}
		return "El sueldo es: " + sueldoBase;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	
	
	

}
