package asociacion.services;

import asociacion.entity.CelulaHeroe;

import java.util.List;

public interface ICelulaHeroeService {
    public List<CelulaHeroe> findAll();

    public CelulaHeroe findById(Long id);

    public CelulaHeroe save(CelulaHeroe celulaHeroe);

    public void delete(Long id);

}
