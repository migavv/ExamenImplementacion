package asociacion.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "monstruos")
public class Monstruo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        @Column(name = "idmonstruo")
        private Long id;

        @Column(name = "nombre")
        private String nombre;

        @Column(name= "nivelamenaza")
        private String amenaza;

        @OneToMany(mappedBy = "monstruo")
         private List<Batalla> batallas;

     @OneToMany(mappedBy = "monstruo")
     private List<CelulaMonstruo> celulasMonstruo;

    @OneToMany(mappedBy = "monstruo", fetch = FetchType.LAZY)
    private List<PatrocinadorMonstruo> patrocinadorMonstruos;


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
        public String getAmenaza() {
        return amenaza;
    }

    public void setAmenaza(String amenaza) {
        this.amenaza = amenaza;
    }
}
