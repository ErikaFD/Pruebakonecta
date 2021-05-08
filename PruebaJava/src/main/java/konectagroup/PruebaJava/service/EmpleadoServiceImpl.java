package konectagroup.PruebaJava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import konectagroup.PruebaJava.dao.EmpleadoRepositorio;
import konectagroup.PruebaJava.model.Empleado;
@Service("empleadoService")
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepositorio empleadoRepositorio;
	
	@Override	
	public List<Empleado> obtenerEmpleado() {
				
	    
	    return empleadoRepositorio.findAll();
	}

	@Override
	public boolean guardarEmpleado(Empleado datosEmpleados) {
		empleadoRepositorio.save(datosEmpleados);
			
		return true;
	}

}
