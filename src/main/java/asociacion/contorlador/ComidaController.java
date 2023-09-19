package asociacion.contorlador;


import asociacion.entity.Comida;
import asociacion.services.IComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comidas")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ComidaController {
    @Autowired
    private IComidaService comidaService;

    @GetMapping("/comidas")
    public List<Comida> findAll(){
        return comidaService.findAll();
    }

    @GetMapping("/comidas/{idComidas}")
    public Comida findByID(@PathVariable Long idComida){
        return comidaService.findById(idComida);
    }

    @DeleteMapping("/comidas/{idComidas}")
    public void delete(@PathVariable Long idComida){
        comidaService.delete(idComida);
    }

    @PostMapping("/comidas")
    public Comida save(@RequestBody Comida comida){
        return comidaService.save(comida);
    }

    @PutMapping("/comidas/{idComidas}")
    public Comida update(@RequestBody Comida comida, @PathVariable Long idComida){
        Comida actual = comidaService.findById(idComida);
        actual.setNombre(comida.getNombre());
        return comidaService.save(actual);
    }
}
