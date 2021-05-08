package konectagroup.PruebaJava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import konectagroup.PruebaJava.model.Empleado;

@Repository 
public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer>{
	
	

}
