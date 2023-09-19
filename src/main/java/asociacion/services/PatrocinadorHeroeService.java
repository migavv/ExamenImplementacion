package asociacion.services;

import asociacion.dao.IPatrocinadorHeroeDAO;
import asociacion.entity.PatrocinadorHeroe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatrocinadorHeroeService implements IPatrocinadorHeroeService{

    @Autowired
    private IPatrocinadorHeroeDAO patrocinadorHeroeDAO;
    @Override
    public List<PatrocinadorHeroe> findAll() {
        return patrocinadorHeroeDAO.findAll();
    }

    @Override
    public PatrocinadorHeroe findByIds(Long id, Long id2) {
        return patrocinadorHeroeDAO.findById(id).orElse(null);
    }

    @Override
    public PatrocinadorHeroe save(PatrocinadorHeroe patrocinadorHeroe) {
        return patrocinadorHeroeDAO.save(patrocinadorHeroe);
    }

    @Override
    public void delete(Long id, Long id2) {
        patrocinadorHeroeDAO.deleteById(id);
    }
}
