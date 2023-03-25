package com.proyecto.arprog.repositorio;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto.arprog.entidad.Experiencia;


@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {
    
    public Optional<Experiencia> findByNombreE(String nombreE);
    public boolean existsByNombreE (String nombreE);



}
