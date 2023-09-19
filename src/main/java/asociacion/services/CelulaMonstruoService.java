package asociacion.services;

import asociacion.dao.ICelulaMonstruoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelulaMonstruoService implements ICelulaMonstruoService{

    @Autowired
    private ICelulaMonstruoDAO celulaMonstruoDAO;

    @Override
    public List<asociacion.entity.CelulaMonstruo> findAll() {
        return celulaMonstruoDAO.findAll();
    }

    @Override
    public asociacion.entity.CelulaMonstruo findById(Long id) {
        return celulaMonstruoDAO.findById(id).orElse(null);
    }

    @Override
    public asociacion.entity.CelulaMonstruo save(asociacion.entity.CelulaMonstruo celulaMonstruo) {
        return celulaMonstruoDAO.save(celulaMonstruo);
    }

    @Override
    public void delete(Long id) {
        celulaMonstruoDAO.deleteById(id);
    }
}
