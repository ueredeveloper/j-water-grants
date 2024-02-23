package  com.api.main.repositories;

import com.api.main.models.UsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

}