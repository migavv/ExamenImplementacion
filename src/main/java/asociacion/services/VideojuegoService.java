package asociacion.services;

import asociacion.dao.IVideojuegoDAO;
import asociacion.entity.Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService implements IVideojuegosService{

    @Autowired
    private IVideojuegoDAO videojuegoDAO;

    @Override
    public List<Videojuego> findAll() {
        return videojuegoDAO.findAll();
    }

    @Override
    public Videojuego findById(Long id) {
        return videojuegoDAO.findById(id).orElse(null);
    }

    @Override
    public Videojuego save(Videojuego videojuego) {
        return videojuegoDAO.save(videojuego);
    }

    @Override
    public void delete(Long id) {
        videojuegoDAO.deleteById(id);
    }
}
