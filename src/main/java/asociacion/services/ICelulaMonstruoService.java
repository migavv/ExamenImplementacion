package asociacion.services;

import asociacion.entity.CelulaMonstruo;


import java.util.List;

public interface ICelulaMonstruoService {

    public List<CelulaMonstruo> findAll();

    public CelulaMonstruo findById(Long id);

    public CelulaMonstruo save(CelulaMonstruo celulaMonstruo);

    public void delete(Long id);
}
