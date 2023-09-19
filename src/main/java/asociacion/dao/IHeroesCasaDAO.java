package asociacion.dao;

import asociacion.entity.HeroesCasa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHeroesCasaDAO extends JpaRepository<HeroesCasa, Long> {
}
