package asociacion.dao;

import asociacion.entity.PatrocinadorHeroe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatrocinadorHeroeDAO extends JpaRepository<PatrocinadorHeroe, Long> {
}
