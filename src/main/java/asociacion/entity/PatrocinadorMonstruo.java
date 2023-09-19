package asociacion.entity;

import asociacion.composite_id.PatrocinadorMonstruoID;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "patrocinadores_monstruos")
public class PatrocinadorMonstruo implements Serializable {

    @EmbeddedId
    private PatrocinadorMonstruoID id;

    @ManyToOne
    @MapsId("idmonstruo")
    @JoinColumn(name = "idmonstruo", insertable = false, updatable = false)
    private Monstruo monstruo;

    @ManyToOne
    @MapsId("idpatrocinador")
    @JoinColumn(name = "idpatrocinador", insertable = false, updatable = false)
    private Patrocinador patrocinador;

    public PatrocinadorMonstruo() {
    }

    public PatrocinadorMonstruo(Monstruo monstruo, Patrocinador patrocinador) {
        this.monstruo = monstruo;
        this.patrocinador = patrocinador;
    }

    public PatrocinadorMonstruoID getId() {
        return id;
    }

    public void setId(PatrocinadorMonstruoID id) {
        this.id = id;
    }

    public Monstruo getMonstruo() {
        return monstruo;
    }

    public void setMonstruo(Monstruo monstruo) {
        this.monstruo = monstruo;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }

}
