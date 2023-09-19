package asociacion.services;

import asociacion.entity.HeroesCasa;

import java.util.List;

public interface IHeroesCasaService {

    public List<HeroesCasa> findAll();

    public HeroesCasa findById(Long id);

    public HeroesCasa save(HeroesCasa heroesCasa);

    public void delete(Long id);
}
