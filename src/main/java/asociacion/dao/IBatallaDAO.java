package asociacion.dao;

import asociacion.entity.Batalla;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBatallaDAO extends JpaRepository<Batalla, Long> {
}
