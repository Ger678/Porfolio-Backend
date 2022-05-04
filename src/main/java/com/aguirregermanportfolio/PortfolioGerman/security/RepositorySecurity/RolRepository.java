
import com.aguirregermanportfolio.PortfolioGerman.security.Enums.RolNombre;
import com.aguirregermanportfolio.PortfolioGerman.security.ModelSecurity.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author German
 */
@Repository
public interface RolRepository extends JpaRepository <Rol, Integer>{
    Optional<Rol>findByRolNombre(RolNombre rolNombre);
}
