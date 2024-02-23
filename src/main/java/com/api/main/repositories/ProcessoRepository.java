package  com.api.main.repositories;

import com.api.main.models.ProcessoModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  ProcessoRepository extends JpaRepository<ProcessoModel, Long>{

}