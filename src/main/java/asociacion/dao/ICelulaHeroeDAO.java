package asociacion.dao;

import asociacion.entity.CelulaHeroe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICelulaHeroeDAO extends JpaRepository<CelulaHeroe, Long> {

}
