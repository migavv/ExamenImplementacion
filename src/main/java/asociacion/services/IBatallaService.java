package asociacion.services;

import asociacion.entity.Batalla;

import java.util.List;

public interface IBatallaService {
    public List<Batalla> findAll();

    public Batalla findById(Long id);

    public Batalla save(Batalla Batalla);

    public void delete(Long id);
}
