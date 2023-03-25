package com.proyecto.arprog.Security.Service;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.arprog.Security.Entity.Rol;
import com.proyecto.arprog.Security.Enums.RolNombre;
import com.proyecto.arprog.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save (Rol rol){
        irolRepository.save(rol);
    }

}