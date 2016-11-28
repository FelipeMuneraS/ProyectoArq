package dto;
// Generated 28/11/2016 09:17:57 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Estudiante generated by hbm2java
 */
@Entity
@Table(name="Estudiante"
    ,catalog="mydb"
)
public class Estudiante  implements java.io.Serializable {


     private EstudianteId id;
     private String nombre;
     private String apellido;
     private String estado;
     private Date fechaInscripcion;
     private String correo;
     private String telefono;
     private String celular;
     private Set<Matricula> matriculas = new HashSet<Matricula>(0);
     private Set<Clase> clases = new HashSet<Clase>(0);

    public Estudiante() {
    }

	
    public Estudiante(EstudianteId id, String nombre, String apellido, String estado, Date fechaInscripcion, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.fechaInscripcion = fechaInscripcion;
        this.correo = correo;
    }
    public Estudiante(EstudianteId id, String nombre, String apellido, String estado, Date fechaInscripcion, String correo, String telefono, String celular, Set<Matricula> matriculas, Set<Clase> clases) {
       this.id = id;
       this.nombre = nombre;
       this.apellido = apellido;
       this.estado = estado;
       this.fechaInscripcion = fechaInscripcion;
       this.correo = correo;
       this.telefono = telefono;
       this.celular = celular;
       this.matriculas = matriculas;
       this.clases = clases;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="tipoDocumento", column=@Column(name="Tipo_Documento", nullable=false, length=5) ), 
        @AttributeOverride(name="documento", column=@Column(name="Documento", nullable=false, length=45) ) } )
    public EstudianteId getId() {
        return this.id;
    }
    
    public void setId(EstudianteId id) {
        this.id = id;
    }

    
    @Column(name="Nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="Apellido", nullable=false, length=45)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Column(name="Estado", nullable=false, length=45)
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Fecha_inscripcion", nullable=false, length=10)
    public Date getFechaInscripcion() {
        return this.fechaInscripcion;
    }
    
    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    
    @Column(name="Correo", nullable=false, length=45)
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    @Column(name="Telefono", length=25)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="Celular", length=25)
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="estudiante")
    public Set<Matricula> getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="Asistencia", catalog="mydb", joinColumns = { 
        @JoinColumn(name="Estudiante_Tipo_Documento", nullable=false, updatable=false), 
        @JoinColumn(name="Estudiante_Documento", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="Clase_idClase", nullable=false, updatable=false) })
    public Set<Clase> getClases() {
        return this.clases;
    }
    
    public void setClases(Set<Clase> clases) {
        this.clases = clases;
    }




}

