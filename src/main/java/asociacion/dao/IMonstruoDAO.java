package asociacion.dao;

import asociacion.entity.Monstruo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMonstruoDAO extends JpaRepository<Monstruo, Long> {

}
