package asociacion.entity;

import asociacion.composite_id.PatrocinadorHeroeID;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "patrocinadores_heroes")
public class PatrocinadorHeroe implements Serializable {

    @EmbeddedId
    private PatrocinadorHeroeID id;

    @ManyToOne
    @MapsId("idheroe")
    @JoinColumn(name = "idheroe", insertable = false, updatable = false)
    private Heroe heroe;

    @ManyToOne
    @MapsId("idpatrocinador")
    @JoinColumn(name = "idpatrocinador", insertable = false, updatable = false)
    private Patrocinador patrocinador;

    public PatrocinadorHeroe() {
    }

    public PatrocinadorHeroe(Heroe heroe, Patrocinador patrocinador) {
        this.heroe = heroe;
        this.patrocinador = patrocinador;
    }

    public PatrocinadorHeroeID getId() {
        return id;
    }

    public void setId(PatrocinadorHeroeID id) {
        this.id = id;
    }

    public Heroe getHeroe() {
        return heroe;
    }

    public void setHeroe(Heroe heroe) {
        this.heroe = heroe;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }
}
