package com.proyecto.arprog.repositorio;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.arprog.entidad.hys;


public interface Rhys extends JpaRepository<hys, Integer> {
    
    Optional<hys> findByNombre(String nombre);

    public boolean existsByNombre (String nombre);


}
