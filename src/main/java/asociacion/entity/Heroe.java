package asociacion.entity;

import net.bytebuddy.utility.dispatcher.JavaDispatcher;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "heroes")
public class Heroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idheroe")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "rango")
    private char rango;

    @Column(name = "habilidad")
    private Long habilidad;

    @Column(name = "monstruoscombatidos")
    private String monstruosCombatidos;

    @Column(name = "residencia")
    private String residencia;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "fans")
    private Long fans;

    @OneToMany(mappedBy = "heroe")
    private List<Batalla> batallas;

    @OneToMany(mappedBy = "heroe", fetch = FetchType.LAZY)
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

    public char getRango() {
        return rango;
    }

    public void setRango(char rango) {
        this.rango = rango;
    }

    public Long getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Long habilidad) {
        this.habilidad = habilidad;
    }

    public String getMonstruosCombatidos() {
        return monstruosCombatidos;
    }

    public void setMonstruosCombatidos(String monstruosCombatidos) {
        this.monstruosCombatidos = monstruosCombatidos;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getFans() {
        return fans;
    }

    public void setFans(Long fans) {
        this.fans = fans;
    }
}
