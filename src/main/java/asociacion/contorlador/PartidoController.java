package asociacion.contorlador;

import asociacion.dao.IPartidoDAO;
import asociacion.entity.Partido;
import asociacion.entity.Videojuego;
import asociacion.services.IPartidoService;
import asociacion.services.IVideojuegosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PartidoController {
    @Autowired
    private IPartidoService partidoService;

    @GetMapping("/partidos")
    public List<Partido> findAll(){
        return partidoService.findAll();
    }

    @GetMapping("/partidos/{idPartidos}")
    public Partido findByID(@PathVariable Long idPartido){
        return partidoService.findById(idPartido);
    }

    @DeleteMapping("/partidos/{idPartidos}")
    public void delete(@PathVariable Long idPartido){
        partidoService.delete(idPartido);
    }

    @PostMapping("/partidos")
    public Partido save(@RequestBody Partido partido){
        return partidoService.save(partido);
    }

    @PutMapping("/partidos/{idPartidos}")
    public Partido update(@RequestBody Partido partido, @PathVariable Long idPartido){
        Partido actual = partidoService.findById(idPartido);
        actual.setResultado(partido.getResultado());
        return partidoService.save(actual);
    }
}
