package asociacion.services;

import asociacion.entity.Heroe;
import asociacion.entity.Patrocinador;

import java.util.List;

public interface IPatrocinadorService {
    public List<Patrocinador> findAll();

    public Patrocinador findById(Long id);

    public Patrocinador save(Patrocinador patrocinador);

    public void delete(Long id);
}
