package asociacion.contorlador;



import asociacion.entity.Videojuego;
import asociacion.services.IVideojuegosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videojuegos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class VideojuegoController {
    @Autowired
    private IVideojuegosService videojuegosService;

    @GetMapping("/videojuegos")
    public List<Videojuego> findAll(){
        return videojuegosService.findAll();
    }

    @GetMapping("/videojuegos/{idVideojuegos}")
    public Videojuego findByID(@PathVariable Long idVideojuegos){
        return videojuegosService.findById(idVideojuegos);
    }

    @DeleteMapping("/videojuegos/{idVideojuegos}")
    public void delete(@PathVariable Long idVideojuego){
        videojuegosService.delete(idVideojuego);
    }

    @PostMapping("/videojuegos")
    public Videojuego save(@RequestBody Videojuego videojuego){
        return videojuegosService.save(videojuego);
    }

    @PutMapping("/videojuegos/{idVideojuegos}")
    public Videojuego update(@RequestBody Videojuego videojuego, @PathVariable Long idVideojuego){
        Videojuego actual = videojuegosService.findById(idVideojuego);
        actual.setNombre(videojuego.getNombre());
        return videojuegosService.save(actual);
    }
}
