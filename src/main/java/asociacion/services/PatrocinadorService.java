package asociacion.services;

import asociacion.dao.IHeroeDAO;
import asociacion.dao.IPatrocinadorDAO;
import asociacion.entity.Patrocinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatrocinadorService implements IPatrocinadorService {

    @Autowired
    private IPatrocinadorDAO patrocinadorDAO;

    @Override
    public List<Patrocinador> findAll() {
        return patrocinadorDAO.findAll();
    }

    @Override
    public Patrocinador findById(Long id) {
        return patrocinadorDAO.findById(id).orElse(null);
    }

    @Override
    public Patrocinador save(Patrocinador patrocinador) {
        return patrocinadorDAO.save(patrocinador);
    }

    @Override
    public void delete(Long id) {
        patrocinadorDAO.deleteById(id);
    }

    public Patrocinador update(Long patrocinadorId, Patrocinador Patrocinador) {
        Patrocinador c = findById(patrocinadorId);

        if (c != null){
            c.setNombre(Patrocinador.getNombre());

        }
        else {
            return null;
        }
        return patrocinadorDAO.save(c);

    }

}
