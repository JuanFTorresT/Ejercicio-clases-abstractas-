package logica;

public class UsoEmpleados {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[4];
		
		empleados[0]= new EmpleadoAsalariado("6546546Z", "Antonio", "López", 2014, 1125);
		empleados[1]= new EmpleadoComision("7879879S", "Sandra", "Nieto", 2011, 169 , 7.10);
		empleados[2]= new EmpleadoComision();
		empleados[3]= new EmpleadoAsalariado();
		
		EmpleadoComision manuel = (EmpleadoComision) empleados[2];
		
		
		manuel.setDni("4654654D");
		manuel.setNombre("Manuel");
		manuel.setApellidos("Ruíz");
		manuel.setAñoIngresoEmpresa(2010);
		manuel.setNumeroClientes(35);
		manuel.setComisionCliente(6.90);
		
		EmpleadoAsalariado maria = (EmpleadoAsalariado) empleados[3];
		
		maria.setNombre("Maria");
		maria.setApellidos("Ramos");
		maria.setDni("77879878F");
		maria.setAñoIngresoEmpresa(2011);
		maria.setSueldoBase(1055);	
		
		
		Empleado.sueldoMayor(empleados);
		
		Empleado.mostrarTodos(empleados);
		
	}

}
