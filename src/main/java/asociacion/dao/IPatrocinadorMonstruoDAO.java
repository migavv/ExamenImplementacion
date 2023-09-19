package asociacion.dao;

import asociacion.entity.Patrocinador;
import asociacion.entity.PatrocinadorMonstruo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatrocinadorMonstruoDAO extends JpaRepository<PatrocinadorMonstruo, Long> {

}
