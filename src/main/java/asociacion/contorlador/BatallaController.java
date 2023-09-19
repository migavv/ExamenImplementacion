package asociacion.contorlador;

import asociacion.entity.Batalla;
import asociacion.entity.Heroe;
import asociacion.services.IBatallaService;
import asociacion.services.IHeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batallas")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class BatallaController {

    @Autowired
    private IBatallaService batallaService;

    @GetMapping("/batallas")
    public List<Batalla> findAll(){
        return batallaService.findAll();
    }

    @GetMapping("/batallas/{idbatallas}")
    public Batalla findByID(@PathVariable Long idBatalla){
        return batallaService.findById(idBatalla);
    }

    @DeleteMapping("/batallas/{idbatallas}")
    public void delete(@PathVariable Long idBatalla){
        batallaService.delete(idBatalla);
    }

    @PostMapping("/batallas")
    public Batalla save(@RequestBody Batalla batalla){
        return batallaService.save(batalla);
    }

    @PutMapping("/batallas/{idbatallas}")
    public Batalla update(@RequestBody Batalla batalla, @PathVariable Long idBatalla){
        Batalla actual = batallaService.findById(idBatalla);
        actual.setResultadobatalla(batalla.getResultadobatalla());


        return batallaService.save(actual);
    }


}
