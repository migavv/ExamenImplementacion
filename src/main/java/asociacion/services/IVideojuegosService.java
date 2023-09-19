package asociacion.services;


import asociacion.entity.Videojuego;

import java.util.List;

public interface IVideojuegosService {

    public List<Videojuego> findAll();

    public Videojuego findById(Long id);

    public Videojuego save(Videojuego videojuego);

    public void delete(Long id);
}
