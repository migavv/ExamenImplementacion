package asociacion.composite_id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PatrocinadorMonstruoID implements Serializable {

    @Column(name = "idmonstruo")
    private Long idMonstruo;

    @Column(name = "idpatrocinador")
    private Long idPatrocinador;

    public PatrocinadorMonstruoID(){

    }

    public PatrocinadorMonstruoID(Long idMonstruo, Long idPatrocinador) {
        this.idMonstruo = idMonstruo;
        this.idPatrocinador = idPatrocinador;
    }

    public Long getIdMonstruo() {
        return idMonstruo;
    }

    public void setIdMonstruo(Long idMonstruo) {
        this.idMonstruo = idMonstruo;
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

        PatrocinadorMonstruoID that = (PatrocinadorMonstruoID) o;

        return idMonstruo.equals(that.idMonstruo) && idPatrocinador.equals(that.idPatrocinador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMonstruo, idPatrocinador);
    }

}
