package asociacion.dao;

import asociacion.entity.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComidaDAO extends JpaRepository<Comida, Long> {
}
