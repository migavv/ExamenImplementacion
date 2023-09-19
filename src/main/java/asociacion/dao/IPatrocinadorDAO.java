package asociacion.dao;

import asociacion.entity.Patrocinador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatrocinadorDAO extends JpaRepository<Patrocinador, Long> {

}
