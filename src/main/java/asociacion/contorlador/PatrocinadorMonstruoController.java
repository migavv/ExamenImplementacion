package asociacion.contorlador;

import asociacion.entity.PatrocinadorMonstruo;
import asociacion.services.IPatrocinadorMonstruoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patrocinadorMonstruo")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PatrocinadorMonstruoController {

    @Autowired
    private IPatrocinadorMonstruoService patrocinadorMonstruoService;

    @GetMapping("/patrocinadorMonstruo")
    public List<PatrocinadorMonstruo> findAll(){
        return patrocinadorMonstruoService.findAll();
    }

    @GetMapping("/patrocinadorMonstruo/{idPatrocinadorMonstruo}")
    public PatrocinadorMonstruo findByIDs(@PathVariable Long idPatrocinadorMonstruo,@PathVariable Long idPatrocinadorMonstruo2){
        return patrocinadorMonstruoService.findByIds(idPatrocinadorMonstruo, idPatrocinadorMonstruo2);
    }

    @DeleteMapping("/patrocinadorMonstruo/{idPatrocinadorMonstruo}")
    public void delete(@PathVariable Long idPatrocinadorMonstruo,@PathVariable Long idPatrocinadorMonstruo2){
        patrocinadorMonstruoService.delete(idPatrocinadorMonstruo, idPatrocinadorMonstruo2);
    }

    @PostMapping("/patrocinadorMonstruo")
    public PatrocinadorMonstruo save(@RequestBody PatrocinadorMonstruo patrocinadorMonstruo){
        return patrocinadorMonstruoService.save(patrocinadorMonstruo);
    }
}
