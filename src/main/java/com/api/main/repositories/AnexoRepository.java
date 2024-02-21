package  com.api.main.repositories;

import com.api.main.models.AnexoModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AnexoRepository extends JpaRepository<AnexoModel, Long>{

}