package logica;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private int AñoIngresoEmpresa;
	
	public Empleado(String dni, String nombre, String apellidos, int año) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		AñoIngresoEmpresa=año;
		
	}
	
	public Empleado() {
		
	}
	
	public String imprimir() {
		return "Dni: " + dni + " | Nombre: " + nombre + " | Apellidos: " + apellidos +
				" | Año de ingreso a la empresa: " + AñoIngresoEmpresa;
	}
	
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAñoIngresoEmpresa() {
		return AñoIngresoEmpresa;
	}

	public void setAñoIngresoEmpresa(int añoIngresoEmpresa) {
		AñoIngresoEmpresa = añoIngresoEmpresa;
	}
	
	public static void sueldoMayor(Empleado[] empleados) {
		double sueldoMayor = 0;
		String nombreSueldoMayor = "";
		for (Empleado empleado : empleados) {
			if (Double.parseDouble(empleado.getSalario().substring(13))>sueldoMayor) {
				sueldoMayor = Double.parseDouble(empleado.getSalario().substring(13));
				nombreSueldoMayor = empleado.getNombre() + " " + empleado.getApellidos();
			}
		}
		System.out.println("El empleado con el sueldo mayor es: " + nombreSueldoMayor + "y es de: $" + sueldoMayor);
	}
	
	
	public static void mostrarTodos(Empleado[] empleados) {
		for (Empleado empleado : empleados) {
			System.out.println("DNI: " + empleado.getDni());
			System.out.println("Nombre: " + empleado.getNombre());
			System.out.println("Apellidos: " + empleado.getApellidos());
			System.out.println("Año de ingreso: " + empleado.getAñoIngresoEmpresa());
			System.out.println(empleado.getSalario());
			System.out.println("--------------------------------------------------------");
		}
		
	}

	public abstract String getSalario();
}
