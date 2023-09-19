package asociacion.services;

import asociacion.entity.Comida;
import asociacion.entity.Videojuego;

import java.util.List;

public interface IComidaService {
    public List<Comida> findAll();

    public Comida findById(Long id);

    public Comida save(Comida comida);

    public void delete(Long id);
}
