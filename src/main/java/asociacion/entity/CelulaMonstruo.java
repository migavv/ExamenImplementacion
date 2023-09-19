package asociacion.entity;

import javax.persistence.*;

@Entity
@Table(name = "celulas_monstruo")
public class CelulaMonstruo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idcelula")
    private Long idCelula;

    @Column(name = "idmonstruoc")
    private Long idMonstruo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idmonstruoc", insertable = false, updatable = false)
    private Monstruo monstruo;

    public Long getIdCelula() {
        return idCelula;
    }

    public void setIdCelula(Long idCelula) {
        this.idCelula = idCelula;
    }

    public Long getIdMonstruo() {
        return idMonstruo;
    }

    public void setIdMonstruo(Long idMonstruo) {
        this.idMonstruo = idMonstruo;
    }

    public Monstruo getMonstruo() {
        return monstruo;
    }

    public void setMonstruo(Monstruo monstruo) {
        this.monstruo = monstruo;
    }
}
