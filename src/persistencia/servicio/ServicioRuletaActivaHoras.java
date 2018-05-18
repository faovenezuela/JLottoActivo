
package persistencia.servicio;

import java.util.List;
import org.hibernate.*;
import persistencia.entidad.RuletaActivaHoras;

public class ServicioRuletaActivaHoras {
    private Session sesion;

    public ServicioRuletaActivaHoras() {
        sesion = RuletaActivaHorasHibernateUtil.getSessionFactory().openSession();
        
    }
    public List<RuletaActivaHoras> getAllRuletaActivaHoras(){
        Query q = sesion.createQuery("from RuletaActivaHoras");
        
        
        return q.list();
        
    }
}
