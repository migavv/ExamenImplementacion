package asociacion.services;

import asociacion.entity.Monstruo;

import java.util.List;

public interface IMonstruoService {
    public List<Monstruo> findAll();

    public Monstruo findById(Long id);

    public Monstruo save(Monstruo monstruo);

    public void delete(Long id);
}
