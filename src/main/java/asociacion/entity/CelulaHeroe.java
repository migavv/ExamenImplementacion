package asociacion.entity;

import javax.persistence.*;

@Entity
@Table(name = "celulas_heroe")
public class CelulaHeroe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idcelula")
    private Long idCelula;

    @Column(name = "idheroec")
    private Long idHeroe;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idheroec", insertable = false, updatable = false)
    private Heroe heroe;

    public Long getIdCelula() {
        return idCelula;
    }

    public void setIdCelula(Long idCelula) {
        this.idCelula = idCelula;
    }

    public Long getIdHeroe() {
        return idHeroe;
    }

    public void setIdHeroe(Long idHeroe) {
        this.idHeroe = idHeroe;
    }

    public Heroe getHeroe() {
        return heroe;
    }

    public void setHeroe(Heroe heroe) {
        this.heroe = heroe;
    }

}
