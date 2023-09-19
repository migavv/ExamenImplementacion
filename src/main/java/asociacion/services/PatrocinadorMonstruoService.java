package asociacion.services;

import asociacion.dao.IPatrocinadorDAO;
import asociacion.dao.IPatrocinadorMonstruoDAO;
import asociacion.entity.PatrocinadorMonstruo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatrocinadorMonstruoService implements IPatrocinadorMonstruoService{

    @Autowired
    private IPatrocinadorMonstruoDAO patrocinadorMonstruoDAO;

    @Override
    public List<PatrocinadorMonstruo> findAll() {
        return patrocinadorMonstruoDAO.findAll();
    }

    @Override
    public PatrocinadorMonstruo findByIds(Long id, Long id2) {
        return patrocinadorMonstruoDAO.findById(id).orElse(null);
    }

    @Override
    public PatrocinadorMonstruo save(PatrocinadorMonstruo patrocinadorMonstruo) {
        return patrocinadorMonstruoDAO.save(patrocinadorMonstruo);
    }

    @Override
    public void delete(Long id, Long id2) {
        patrocinadorMonstruoDAO.deleteById(id);
    }
}
