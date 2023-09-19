package asociacion.services;

import asociacion.dao.IHeroesCasaDAO;
import asociacion.entity.HeroesCasa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroesCasaService implements IHeroesCasaService {

    @Autowired
    private IHeroesCasaDAO heroesCasaDAO;
    @Override
    public List<HeroesCasa> findAll() {
        return heroesCasaDAO.findAll();
    }

    @Override
    public HeroesCasa findById(Long id) {
        return heroesCasaDAO.findById(id).orElse(null);
    }

    @Override
    public HeroesCasa save(HeroesCasa heroesCasa) {
        return heroesCasaDAO.save(heroesCasa);
    }

    @Override
    public void delete(Long id) {
        heroesCasaDAO.deleteById(id);
    }
}
