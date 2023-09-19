package asociacion.dao;

import asociacion.entity.Partido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPartidoDAO extends JpaRepository<Partido, Long> {
}
