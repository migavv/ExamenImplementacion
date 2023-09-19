package asociacion.dao;

import asociacion.entity.Heroe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IHeroeDAO extends JpaRepository <Heroe, Long>  {

    public List<Heroe> findTop10ByOrderByHabilidadDesc();

}
