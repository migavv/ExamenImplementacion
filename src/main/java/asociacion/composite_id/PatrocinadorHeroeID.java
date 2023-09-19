package asociacion.composite_id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PatrocinadorHeroeID implements Serializable {
    @Column(name = "idheroe")
    private Long idHeroe;

    @Column(name = "idpatrocinador")
    private Long idPatrocinador;

    public PatrocinadorHeroeID(){

    }

    public PatrocinadorHeroeID(Long idHeroe, Long idPatrocinador) {
        this.idHeroe = idHeroe;
        this.idPatrocinador = idPatrocinador;
    }

    public Long getIdHeroe() {
        return idHeroe;
    }

    public void setIdHeroe(Long idHeroe) {
        this.idHeroe = idHeroe;
    }

    public Long getIdPatrocinador() {
        return idPatrocinador;
    }

    public void setIdPatrocinador(Long idPatrocinador) {
        this.idPatrocinador = idPatrocinador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatrocinadorHeroeID that = (PatrocinadorHeroeID) o;

        return idHeroe.equals(that.idHeroe) && idPatrocinador.equals(that.idPatrocinador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHeroe, idPatrocinador);
    }
}
