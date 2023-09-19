package asociacion.contorlador;

import asociacion.entity.Batalla;
import asociacion.entity.CelulaMonstruo;
import asociacion.services.CelulaMonstruoService;
import asociacion.services.ICelulaMonstruoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/celulasmonstruo")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class CelulaMonstruoController {
    
    @Autowired
    private ICelulaMonstruoService celulaMonstruoService;

    @GetMapping("/celulasmonstruo")
    public List<CelulaMonstruo> findAll(){
        return celulaMonstruoService.findAll();
    }

    @GetMapping("/celulasmonstruo/{idcelulasmonstruo}")
    public CelulaMonstruo findByID(@PathVariable Long idCelulaMonstruo){
        return celulaMonstruoService.findById(idCelulaMonstruo);
    }

    @DeleteMapping("/celulasmonstruo/{idcelulasmonstruo}")
    public void delete(@PathVariable Long idCelulaMonstruo){
        celulaMonstruoService.delete(idCelulaMonstruo);
    }

    @PostMapping("/celulasmonstruo")
    public CelulaMonstruo save(@RequestBody CelulaMonstruo celulaMonstruo){
        return celulaMonstruoService.save(celulaMonstruo);
    }

    @PutMapping("/celulasmonstruo/{idcelulasmonstruo}")
    public CelulaMonstruo update(@RequestBody CelulaMonstruo celulaMonstruo, @PathVariable Long idCelulaMonstruo){
        CelulaMonstruo actual = celulaMonstruoService.findById(idCelulaMonstruo);
        actual.setIdMonstruo(celulaMonstruo.getIdMonstruo());


        return celulaMonstruoService.save(actual);
    }
    
}
