package dto;
// Generated 28/11/2016 09:17:57 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Matricula generated by hbm2java
 */
@Entity
@Table(name="Matricula"
    ,catalog="mydb"
)
public class Matricula  implements java.io.Serializable {


     private Integer radicado;
     private Estudiante estudiante;
     private Grupo grupo;
     private Date fechaInscripcion;

    public Matricula() {
    }

    public Matricula(Estudiante estudiante, Grupo grupo, Date fechaInscripcion) {
       this.estudiante = estudiante;
       this.grupo = grupo;
       this.fechaInscripcion = fechaInscripcion;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Radicado", unique=true, nullable=false)
    public Integer getRadicado() {
        return this.radicado;
    }
    
    public void setRadicado(Integer radicado) {
        this.radicado = radicado;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="Estudiante_Tipo_Documento", referencedColumnName="Tipo_Documento", nullable=false), 
        @JoinColumn(name="Estudiante_Documento", referencedColumnName="Documento", nullable=false) } )
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="Grupo_Curso_id_Curso", referencedColumnName="Curso_id_Curso", nullable=false), 
        @JoinColumn(name="Grupo_idGrupo", referencedColumnName="idGrupo", nullable=false) } )
    public Grupo getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Fecha_Inscripcion", nullable=false, length=10)
    public Date getFechaInscripcion() {
        return this.fechaInscripcion;
    }
    
    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }




}

