package asociacion.contorlador;


import asociacion.entity.CelulaHeroe;
import asociacion.services.ICelulaHeroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/celulasheroe")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class CelulaHeroeController {
    @Autowired
    private ICelulaHeroeService celulaHeroeService;

    @GetMapping("/celulasheroe")
    public List<CelulaHeroe> findAll(){
        return celulaHeroeService.findAll();
    }

    @GetMapping("/celulasheroe/{idcelulasheroe}")
    public CelulaHeroe findByID(@PathVariable Long idCelulaHeroe){
        return celulaHeroeService.findById(idCelulaHeroe);
    }

    @DeleteMapping("/celulasheroe/{idcelulasheroe}")
    public void delete(@PathVariable Long idCelulaMonstruo){
        celulaHeroeService.delete(idCelulaMonstruo);
    }

    @PostMapping("/celulasheroe")
    public CelulaHeroe save(@RequestBody CelulaHeroe celulaHeroe){
        return celulaHeroeService.save(celulaHeroe);
    }

    @PutMapping("/celulasheroe/{idcelulasheroe}")
    public CelulaHeroe update(@RequestBody CelulaHeroe celulaHeroe, @PathVariable Long idCelulaHeroe){
        CelulaHeroe actual = celulaHeroeService.findById(idCelulaHeroe);
        actual.setIdHeroe(celulaHeroe.getIdHeroe());


        return celulaHeroeService.save(actual);
    }

}
