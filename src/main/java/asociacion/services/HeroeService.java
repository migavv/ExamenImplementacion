package asociacion.services;

import asociacion.dao.IHeroeDAO;
import asociacion.entity.Heroe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroeService implements IHeroesService {

    @Autowired
    private IHeroeDAO heroeDAO;
    
    @Override
    public List<Heroe> findAll() {
        return heroeDAO.findAll();
    }

    @Override
    public Heroe findById(Long id) {
        return heroeDAO.findById(id).orElse(null);
    }

    @Override
    public Heroe save(Heroe Heroe) {
        return heroeDAO.save(Heroe);
    }

    @Override
    public void delete(Long id) {
        heroeDAO.deleteById(id);
    }

    public Heroe update(Long HeroeId, Heroe Heroe) {
        Heroe c = findById(HeroeId);

        if (c != null){
            c.setNombre(Heroe.getNombre());
            c.setRango(Heroe.getRango());
            c.setHabilidad(Heroe.getHabilidad());
            c.setMonstruosCombatidos(Heroe.getMonstruosCombatidos());
            c.setResidencia(Heroe.getResidencia());
            c.setTelefono(Heroe.getTelefono());
            c.setFans(Heroe.getFans());
        }
        else {
            return null;
        }
        return heroeDAO.save(c);

    }
    public List<Heroe> findTop() {
        return heroeDAO.findTop10ByOrderByHabilidadDesc();
    }


}
