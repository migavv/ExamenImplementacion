package asociacion.services;

import asociacion.dao.IComidaDAO;
import asociacion.entity.Comida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComidaService implements IComidaService{

    @Autowired
    private IComidaDAO comidaDAO;

    @Override
    public List<Comida> findAll() {
        return comidaDAO.findAll();
    }

    @Override
    public Comida findById(Long id) {
        return comidaDAO.findById(id).orElse(null);
    }

    @Override
    public Comida save(Comida comida) {
        return comidaDAO.save(comida);
    }

    @Override
    public void delete(Long id) {
        comidaDAO.deleteById(id);
    }
}
