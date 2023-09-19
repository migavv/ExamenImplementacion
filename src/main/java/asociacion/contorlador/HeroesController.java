package asociacion.contorlador;

import asociacion.dao.IHeroeDAO;
import asociacion.entity.Heroe;
import asociacion.services.IHeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heroes")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class HeroesController {

    @Autowired
    private IHeroesService heroesService;

    @Autowired
    private IHeroeDAO heroeDAO;

    @GetMapping("/heroes")
    public List<Heroe> findAll(){
        return heroesService.findAll();
    }

    @GetMapping("/heroes/{idHeroes}")
    public Heroe findByID(@PathVariable Long idHeroes){
        return heroesService.findById(idHeroes);
    }

    @DeleteMapping("/heroes/{idHeroes}")
    public void delete(@PathVariable Long idHeroes){
        heroesService.delete(idHeroes);
    }

    @PostMapping("/heroes")
    public Heroe save(@RequestBody Heroe heroe){
        return heroesService.save(heroe);
    }

    @PutMapping("/heroes/{idHeroes}")
    public Heroe update(@RequestBody Heroe heroe, @PathVariable Long idheroes){
        Heroe actual = heroesService.findById(idheroes);
        actual.setNombre(heroe.getNombre());
        actual.setRango(heroe.getRango());
        actual.setHabilidad(heroe.getHabilidad());
        actual.setMonstruosCombatidos(heroe.getMonstruosCombatidos());
        actual.setResidencia(heroe.getResidencia());
        actual.setTelefono(heroe.getTelefono());
        actual.setFans(heroe.getFans());

        return heroesService.save(actual);
    }

    @GetMapping("/topheroes")
    public List<Heroe> findTop(){
        return heroesService.findTop();
    }

}
