package asociacion.contorlador;

import asociacion.entity.HeroesCasa;
import asociacion.entity.Videojuego;
import asociacion.services.IHeroesCasaService;
import asociacion.services.IVideojuegosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heroesCasa")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class HeroesCasaController {

    @Autowired
    private IHeroesCasaService heroesCasaService;

    @GetMapping("/heroesCasa")
    public List<HeroesCasa> findAll(){
        return heroesCasaService.findAll();
    }

    @GetMapping("/heroesCasa/{idHeroesCasa}")
    public HeroesCasa findByID(@PathVariable Long idHeroesCasa){
        return heroesCasaService.findById(idHeroesCasa);
    }

    @DeleteMapping("/heroesCasa/{idHeroesCasa}")
    public void delete(@PathVariable Long idHeroesCasa){
        heroesCasaService.delete(idHeroesCasa);
    }

    @PostMapping("/heroesCasa")
    public HeroesCasa save(@RequestBody HeroesCasa heroesCasa){
        return heroesCasaService.save(heroesCasa);
    }

    @PutMapping("/heroesCasa/{idHeroesCasa}")
    public HeroesCasa update(@RequestBody HeroesCasa heroesCasa, @PathVariable Long idHeroesCasa){
        HeroesCasa actual = heroesCasaService.findById(idHeroesCasa);
        actual.setNombre(heroesCasa.getNombre());
        actual.setFecha(heroesCasa.getNombre());
        return heroesCasaService.save(actual);
    }

}
