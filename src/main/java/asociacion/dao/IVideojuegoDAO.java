package asociacion.dao;

import asociacion.entity.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVideojuegoDAO extends JpaRepository<Videojuego, Long> {

}
