package asociacion.services;

import asociacion.entity.Heroe;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IHeroesService {
    public List<Heroe> findAll();

    public Heroe findById(Long id);

    public Heroe save(Heroe Heroe);

    public void delete(Long id);

    public List<Heroe> findTop();
}
