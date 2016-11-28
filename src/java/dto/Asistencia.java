package dto;
// Generated 28/11/2016 09:17:57 AM by Hibernate Tools 4.3.1


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tarifa generated by hbm2java
 */
@Entity
@Table(name="Asistencia"
    ,catalog="mydb"
)
public class Asistencia  implements java.io.Serializable {


     private AsistenciaId id;
     private Asistencia asistencia;

    public Asistencia() {
    }

    public Asistencia(AsistenciaId id, Asistencia asistencia) {
        this.id = id;
        this.asistencia = asistencia;
    }
    	
    
   
     @EmbeddedId

    
    public AsistenciaId getId() {
        return this.id;
    }
    
    public void setId(AsistenciaId id) {
        this.id = id;
    }

    public Asistencia getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Asistencia asistencia) {
        this.asistencia = asistencia;
    }
  



}


