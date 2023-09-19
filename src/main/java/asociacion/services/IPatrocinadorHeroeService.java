package asociacion.services;



import asociacion.entity.PatrocinadorHeroe;

import java.util.List;

public interface IPatrocinadorHeroeService {
    public List<PatrocinadorHeroe> findAll();

    public PatrocinadorHeroe findByIds(Long id, Long id2);

    public PatrocinadorHeroe save(PatrocinadorHeroe patrocinadorHeroe);

    public void delete(Long id, Long id2);
}
