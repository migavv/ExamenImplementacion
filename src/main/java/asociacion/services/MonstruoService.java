package asociacion.services;

import asociacion.dao.IMonstruoDAO;
import asociacion.entity.Monstruo;
import asociacion.entity.Patrocinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonstruoService implements IMonstruoService{

    @Autowired
    IMonstruoDAO monstruoDAO;

    @Override
    public List<Monstruo> findAll() {
        return monstruoDAO.findAll();
    }

    @Override
    public Monstruo findById(Long id) {
        return monstruoDAO.findById(id).orElse(null);
    }

    @Override
    public Monstruo save(Monstruo monstruo) {
        return monstruoDAO.save(monstruo);
    }

    @Override
    public void delete(Long id) {
        monstruoDAO.deleteById(id);
    }

    public Monstruo update(Long monstruoId, Monstruo monstruo) {
        Monstruo c = findById(monstruoId);

        if (c != null){
            c.setNombre(monstruo.getNombre());
            c.setAmenaza(monstruo.getAmenaza());

        }
        else {
            return null;
        }
        return monstruoDAO.save(c);

    }
}
