package asociacion.contorlador;

import asociacion.entity.Monstruo;
import asociacion.services.IMonstruoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monstruos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class MonstruoController {

    @Autowired
    private IMonstruoService monstruoService;

    @GetMapping("/monstruos")
    public List<Monstruo> findAll(){
        return monstruoService.findAll();
    }

    @GetMapping("/monstruos/{idMonstruos}")
    public Monstruo findByID(@PathVariable Long idMonstruos){
        return monstruoService.findById(idMonstruos);
    }

    @DeleteMapping("/monstruos/{idMonstruos}")
    public void delete(@PathVariable Long idMonstruo){
        monstruoService.delete(idMonstruo);
    }

    @PostMapping("/monstruos")
    public Monstruo save(@RequestBody Monstruo Monstruo){
        return monstruoService.save(Monstruo);
    }

    @PutMapping("/monstruos/{idMonstruos}")
    public Monstruo update(@RequestBody Monstruo Monstruo, @PathVariable Long idMonstruo){
        Monstruo actual = monstruoService.findById(idMonstruo);
        actual.setNombre(Monstruo.getNombre());
        actual.setAmenaza(Monstruo.getAmenaza());
        return monstruoService.save(actual);
    }
    
}
