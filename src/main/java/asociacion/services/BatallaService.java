package asociacion.services;

import asociacion.dao.IBatallaDAO;
import asociacion.entity.Batalla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatallaService implements IBatallaService{

    @Autowired
    private IBatallaDAO batallaDAO;

    @Override
    public List<Batalla> findAll() {
        return batallaDAO.findAll();
    }

    @Override
    public Batalla findById(Long id) {
        return batallaDAO.findById(id).orElse(null);
    }

    @Override
    public Batalla save(Batalla Batalla) {
        return batallaDAO.save(Batalla);
    }

    @Override
    public void delete(Long id) {
        batallaDAO.deleteById(id);
    }

    public Batalla update(Long BatallaId, Batalla Batalla) {
        Batalla c = findById(BatallaId);

        if (c != null){
            c.setResultadobatalla(Batalla.getResultadobatalla());

        }
        else {
            return null;
        }
        return batallaDAO.save(c);

    }
}
