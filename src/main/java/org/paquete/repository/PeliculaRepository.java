package org.paquete.repository;

import org.paquete.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PeliculaRepository extends CrudRepository<Pelicula, Integer>
{

}
