package entidades;
// Generated 13/05/2019 09:45:27 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ventas generated by hbm2java
 */
public class Ventas  implements java.io.Serializable {


     private int id;
     private String deatalleVentas;
     private long total;
     private Date fecha;
     private Set detalleventas = new HashSet(0);

    public Ventas() {
    }

	
    public Ventas(int id, String deatalleVentas, long total, Date fecha) {
        this.id = id;
        this.deatalleVentas = deatalleVentas;
        this.total = total;
        this.fecha = fecha;
    }
    public Ventas(int id, String deatalleVentas, long total, Date fecha, Set detalleventas) {
       this.id = id;
       this.deatalleVentas = deatalleVentas;
       this.total = total;
       this.fecha = fecha;
       this.detalleventas = detalleventas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDeatalleVentas() {
        return this.deatalleVentas;
    }
    
    public void setDeatalleVentas(String deatalleVentas) {
        this.deatalleVentas = deatalleVentas;
    }
    public long getTotal() {
        return this.total;
    }
    
    public void setTotal(long total) {
        this.total = total;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Set getDetalleventas() {
        return this.detalleventas;
    }
    
    public void setDetalleventas(Set detalleventas) {
        this.detalleventas = detalleventas;
    }




}


