package asociacion.services;

import asociacion.entity.Partido;
import java.util.List;

public interface IPartidoService {

    public List<Partido> findAll();

    public Partido findById(Long id);

    public Partido save(Partido partido);

    public void delete(Long id);
}
