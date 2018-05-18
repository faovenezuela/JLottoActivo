package persistencia.entidad;
// Generated 16-may-2018 17:19:11 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Jugadas generated by hbm2java
 */
public class Jugadas  implements java.io.Serializable {


     private Long numTicket;
     private String serial;
     private Date fecha;
     private String sorteo;
     private String animalito;
     private String numAnimalito;
     private int monto;
     private long total;
     private long pagar;
     private int cantJugadas;
     private int imprimir;
     private String usuario;
     private Date fechaCobro;
     private boolean flagImprimir;

    public Jugadas() {
    }

	
    public Jugadas(Date fecha, String sorteo, String animalito, String numAnimalito, int monto, long total, long pagar, int cantJugadas, int imprimir, String usuario, Date fechaCobro, boolean flagImprimir) {
        this.fecha = fecha;
        this.sorteo = sorteo;
        this.animalito = animalito;
        this.numAnimalito = numAnimalito;
        this.monto = monto;
        this.total = total;
        this.pagar = pagar;
        this.cantJugadas = cantJugadas;
        this.imprimir = imprimir;
        this.usuario = usuario;
        this.fechaCobro = fechaCobro;
        this.flagImprimir = flagImprimir;
    }
    public Jugadas(String serial, Date fecha, String sorteo, String animalito, String numAnimalito, int monto, long total, long pagar, int cantJugadas, int imprimir, String usuario, Date fechaCobro, boolean flagImprimir) {
       this.serial = serial;
       this.fecha = fecha;
       this.sorteo = sorteo;
       this.animalito = animalito;
       this.numAnimalito = numAnimalito;
       this.monto = monto;
       this.total = total;
       this.pagar = pagar;
       this.cantJugadas = cantJugadas;
       this.imprimir = imprimir;
       this.usuario = usuario;
       this.fechaCobro = fechaCobro;
       this.flagImprimir = flagImprimir;
    }
   
    public Long getNumTicket() {
        return this.numTicket;
    }
    
    public void setNumTicket(Long numTicket) {
        this.numTicket = numTicket;
    }
    public String getSerial() {
        return this.serial;
    }
    
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getSorteo() {
        return this.sorteo;
    }
    
    public void setSorteo(String sorteo) {
        this.sorteo = sorteo;
    }
    public String getAnimalito() {
        return this.animalito;
    }
    
    public void setAnimalito(String animalito) {
        this.animalito = animalito;
    }
    public String getNumAnimalito() {
        return this.numAnimalito;
    }
    
    public void setNumAnimalito(String numAnimalito) {
        this.numAnimalito = numAnimalito;
    }
    public int getMonto() {
        return this.monto;
    }
    
    public void setMonto(int monto) {
        this.monto = monto;
    }
    public long getTotal() {
        return this.total;
    }
    
    public void setTotal(long total) {
        this.total = total;
    }
    public long getPagar() {
        return this.pagar;
    }
    
    public void setPagar(long pagar) {
        this.pagar = pagar;
    }
    public int getCantJugadas() {
        return this.cantJugadas;
    }
    
    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }
    public int getImprimir() {
        return this.imprimir;
    }
    
    public void setImprimir(int imprimir) {
        this.imprimir = imprimir;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public Date getFechaCobro() {
        return this.fechaCobro;
    }
    
    public void setFechaCobro(Date fechaCobro) {
        this.fechaCobro = fechaCobro;
    }
    public boolean isFlagImprimir() {
        return this.flagImprimir;
    }
    
    public void setFlagImprimir(boolean flagImprimir) {
        this.flagImprimir = flagImprimir;
    }




}

