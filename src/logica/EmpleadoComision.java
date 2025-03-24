package logica;

public class EmpleadoComision extends Empleado{
	private double sueldoBase;
	private int numeroClientes;
	private double comisionCliente;
	
	public EmpleadoComision() {
		super();
		sueldoBase=950;
		numeroClientes=0;
	}
	
	public EmpleadoComision(String dni, String nombre, String apellidos, int año, int numeroClientes,
			double comisionCliente) {
		super(dni,nombre,apellidos,año);
		sueldoBase=952;
		this.numeroClientes = numeroClientes;
		this.comisionCliente = comisionCliente;
	}
	
	

	@Override
	public String getSalario() {
		
		if ((numeroClientes*comisionCliente)<sueldoBase) {
			return "El sueldo es: " + sueldoBase;
		}else {
			sueldoBase = numeroClientes*comisionCliente;
			return "El sueldo es: " + sueldoBase;
		}
	}

	public int getNumeroClientes() {
		return numeroClientes;
	}

	public void setNumeroClientes(int numeroClientes) {
		this.numeroClientes = numeroClientes;
	}

	public double getComisionCliente() {
		return comisionCliente;
	}

	public void setComisionCliente(double comisionCliente) {
		this.comisionCliente = comisionCliente;
	}
	
	

}
