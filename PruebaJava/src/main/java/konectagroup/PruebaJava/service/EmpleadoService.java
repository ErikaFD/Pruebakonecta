package konectagroup.PruebaJava.service;

import java.util.List;

import konectagroup.PruebaJava.model.Empleado;

public interface EmpleadoService {
	List<Empleado> obtenerEmpleado();
	boolean guardarEmpleado(Empleado datosEmpleados);

}
