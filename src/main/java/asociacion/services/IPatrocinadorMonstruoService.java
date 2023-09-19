package asociacion.services;

import asociacion.entity.PatrocinadorMonstruo;

import java.util.List;

public interface IPatrocinadorMonstruoService {

    public List<PatrocinadorMonstruo> findAll();

    public PatrocinadorMonstruo findByIds(Long id, Long id2);

    public PatrocinadorMonstruo save(PatrocinadorMonstruo patrocinadorMonstruo);

    public void delete(Long id, Long id2);
}
