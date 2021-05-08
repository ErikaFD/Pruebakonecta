package konectagroup.PruebaJava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import konectagroup.PruebaJava.model.Empleado;
import konectagroup.PruebaJava.service.EmpleadoService;

@CrossOrigin
@RestController
@RequestMapping("/api/")

public class EmpleadoController {
	
	@Autowired 
	private EmpleadoService empleadoServicio;

    @GetMapping("/empleado") 
	public ResponseEntity<List<Empleado>> getEmpleado() {
		return new ResponseEntity<>( empleadoServicio.obtenerEmpleado() , HttpStatus.OK);
	}
    @PostMapping("/empleado") 
	public ResponseEntity<String> guardarEmpleado(@RequestBody Empleado empleadoInfo) {
    	empleadoServicio.guardarEmpleado(empleadoInfo);
		return new ResponseEntity<>( "El empleado se guardo correctamente" , HttpStatus.OK);
		
    }

}
