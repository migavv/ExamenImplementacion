package asociacion.entity;

import javax.persistence.*;

@Entity
@Table(name = "batallas")
public class Batalla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idbatalla")
    private Long idbatalla;

    @Column(name = "idheroe")
    private Long idheroe;

    @Column(name= "idmonstruo")
    private Long idmonstruo;

    @Column(name= "resultadobatalla")
    private String resultadobatalla;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idheroe", insertable = false, updatable = false)
    private Heroe heroe;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idmonstruo", insertable = false, updatable = false)
    private Monstruo monstruo;

    public Long getIdbatalla() {
        return idbatalla;
    }

    public void setIdbatalla(Long idbatalla) {
        this.idbatalla = idbatalla;
    }

    public Long getIdheroe() {
        return idheroe;
    }

    public void setIdheroe(Long idheroe) {
        this.idheroe = idheroe;
    }

    public Long getIdmonstruo() {
        return idmonstruo;
    }

    public void setIdmonstruo(Long idmonstruo) {
        this.idmonstruo = idmonstruo;
    }

    public String getResultadobatalla() {
        return resultadobatalla;
    }

    public void setResultadobatalla(String resultadobatalla) {
        this.resultadobatalla = resultadobatalla;
    }

    public Heroe getHeroe() {
        return heroe;
    }

    public void setHeroe(Heroe heroe) {
        this.heroe = heroe;
    }

    public Monstruo getMonstruo() {
        return monstruo;
    }

    public void setMonstruo(Monstruo monstruo) {
        this.monstruo = monstruo;
    }
}
