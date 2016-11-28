package dto;
// Generated 28/11/2016 09:17:57 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Grupo generated by hbm2java
 */
@Entity
@Table(name="Grupo"
    ,catalog="mydb"
)
public class Grupo  implements java.io.Serializable {


     private GrupoId id;
     private Curso curso;
     private String numeroIntegrantes;
     private String aula;
     private int cuposDisponibles;
     private Set<Clase> clases = new HashSet<Clase>(0);
     private Set<Matricula> matriculas = new HashSet<Matricula>(0);
     private Set<Horario> horarios = new HashSet<Horario>(0);

    public Grupo() {
    }

	
    public Grupo(GrupoId id, Curso curso, String numeroIntegrantes, String aula, int cuposDisponibles) {
        this.id = id;
        this.curso = curso;
        this.numeroIntegrantes = numeroIntegrantes;
        this.aula = aula;
        this.cuposDisponibles = cuposDisponibles;
    }
    public Grupo(GrupoId id, Curso curso, String numeroIntegrantes, String aula, int cuposDisponibles, Set<Clase> clases, Set<Matricula> matriculas, Set<Horario> horarios) {
       this.id = id;
       this.curso = curso;
       this.numeroIntegrantes = numeroIntegrantes;
       this.aula = aula;
       this.cuposDisponibles = cuposDisponibles;
       this.clases = clases;
       this.matriculas = matriculas;
       this.horarios = horarios;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="cursoIdCurso", column=@Column(name="Curso_id_Curso", nullable=false) ), 
        @AttributeOverride(name="idGrupo", column=@Column(name="idGrupo", nullable=false) ) } )
    public GrupoId getId() {
        return this.id;
    }
    
    public void setId(GrupoId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Curso_id_Curso", nullable=false, insertable=false, updatable=false)
    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
    @Column(name="Numero_Integrantes", nullable=false, length=10)
    public String getNumeroIntegrantes() {
        return this.numeroIntegrantes;
    }
    
    public void setNumeroIntegrantes(String numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    
    @Column(name="Aula", nullable=false, length=10)
    public String getAula() {
        return this.aula;
    }
    
    public void setAula(String aula) {
        this.aula = aula;
    }

    
    @Column(name="Cupos_Disponibles", nullable=false)
    public int getCuposDisponibles() {
        return this.cuposDisponibles;
    }
    
    public void setCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grupo")
    public Set<Clase> getClases() {
        return this.clases;
    }
    
    public void setClases(Set<Clase> clases) {
        this.clases = clases;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grupo")
    public Set<Matricula> getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grupo")
    public Set<Horario> getHorarios() {
        return this.horarios;
    }
    
    public void setHorarios(Set<Horario> horarios) {
        this.horarios = horarios;
    }




}

