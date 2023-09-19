package asociacion.services;

import asociacion.dao.ICelulaHeroeDAO;
import asociacion.entity.CelulaHeroe;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelulaHeroeService implements ICelulaHeroeService{

    @Autowired
    private ICelulaHeroeDAO celulaHeroeDAO;

    @Override
    public List<CelulaHeroe> findAll() {
        return celulaHeroeDAO.findAll();
    }

    @Override
    public CelulaHeroe findById(Long id) {
        return celulaHeroeDAO.findById(id).orElse(null);
    }

    @Override
    public CelulaHeroe save(CelulaHeroe celulaHeroe) {
        return celulaHeroeDAO.save(celulaHeroe);
    }

    @Override
    public void delete(Long id) {
        celulaHeroeDAO.deleteById(id);
    }
}
