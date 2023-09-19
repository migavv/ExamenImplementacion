package asociacion.contorlador;



import asociacion.entity.PatrocinadorHeroe;
import asociacion.services.IPatrocinadorHeroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patrocinadorHeroe")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PatrocinadorHeroeController {

    @Autowired
    private IPatrocinadorHeroeService patrocinadorHeroeService;

    @GetMapping("/patrocinadorHeroe")
    public List<PatrocinadorHeroe> findAll(){
        return patrocinadorHeroeService.findAll();
    }

    @GetMapping("/patrocinadorHeroe/{idPatrocinadorHeroe}")
    public PatrocinadorHeroe findByIDs(@PathVariable Long idPatrocinadorHeroe,@PathVariable Long idPatrocinadorHeroe2){
        return patrocinadorHeroeService.findByIds(idPatrocinadorHeroe, idPatrocinadorHeroe2);
    }

    @DeleteMapping("/patrocinadorHeroe/{idPatrocinadorHeroe}")
    public void delete(@PathVariable Long idPatrocinadorHeroe,@PathVariable Long idPatrocinadorHeroe2){
        patrocinadorHeroeService.delete(idPatrocinadorHeroe, idPatrocinadorHeroe2);
    }

    @PostMapping("/patrocinadorHeroe")
    public PatrocinadorHeroe save(@RequestBody PatrocinadorHeroe patrocinadorHeroe){
        return patrocinadorHeroeService.save(patrocinadorHeroe);
    }
}
