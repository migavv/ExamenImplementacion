package asociacion.services;

import asociacion.dao.IPartidoDAO;
import asociacion.entity.Partido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService implements IPartidoService {
    @Autowired
    private IPartidoDAO partidoDAO;

    @Override
    public List<Partido> findAll() {
        return partidoDAO.findAll();
    }

    @Override
    public Partido findById(Long id) {
        return partidoDAO.findById(id).orElse(null);
    }

    @Override
    public Partido save(Partido partido) {
        return partidoDAO.save(partido);
    }

    @Override
    public void delete(Long id) {
    partidoDAO.deleteById(id);
    }
}
