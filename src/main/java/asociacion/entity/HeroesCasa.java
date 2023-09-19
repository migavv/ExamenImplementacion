package asociacion.entity;

import javax.persistence.*;

@Entity
@Table(name = "heroes_casa")
public class HeroesCasa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idheroescasa")
    private Long id;

    @Column(name = "nombreheroes")
    private String nombre;

    @Column(name = "fecha")
    private String fecha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
