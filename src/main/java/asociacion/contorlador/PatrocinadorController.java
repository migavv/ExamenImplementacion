package asociacion.contorlador;

import asociacion.entity.Patrocinador;
import asociacion.entity.Patrocinador;
import asociacion.services.IPatrocinadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patrocinadores")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PatrocinadorController {

    @Autowired
    private IPatrocinadorService patrocinadorService;

    @GetMapping("/patrocinadores")
    public List<Patrocinador> findAll(){
        return patrocinadorService.findAll();
    }

    @GetMapping("/patrocinadores/{idPatrocinadores}")
    public Patrocinador findByID(@PathVariable Long idPatrocinadors){
        return patrocinadorService.findById(idPatrocinadors);
    }

    @DeleteMapping("/patrocinadores/{idPatrocinadores}")
    public void delete(@PathVariable Long idPatrocinador){
        patrocinadorService.delete(idPatrocinador);
    }

    @PostMapping("/patrocinadores")
    public Patrocinador save(@RequestBody Patrocinador Patrocinador){
        return patrocinadorService.save(Patrocinador);
    }

    @PutMapping("/patrocinadores/{idPatrocinadores}")
    public Patrocinador update(@RequestBody Patrocinador Patrocinador, @PathVariable Long idPatrocinador){
        Patrocinador actual = patrocinadorService.findById(idPatrocinador);
        actual.setNombre(Patrocinador.getNombre());
        return patrocinadorService.save(actual);
    }


}