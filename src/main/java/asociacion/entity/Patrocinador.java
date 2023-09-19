package asociacion.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "patrocinadores")
public class Patrocinador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idpatrocinador")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "patrocinador", fetch = FetchType.LAZY)
    private List<PatrocinadorMonstruo> patrocinadorMonstruos;

    @OneToMany(mappedBy = "patrocinador", fetch = FetchType.LAZY)
    private List<PatrocinadorHeroe> patrocinadorHeroes;

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
}
