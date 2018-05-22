
package persistencia.servicio;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.hibernate.Query;
import org.hibernate.Session;
import persistencia.entidad.Jugadas;
import persistencia.entidad.RuletaActivaHoras;

public class ServicioJugadas {
    private Session sesion;

    public ServicioJugadas() {
        sesion = JugadasHibernateUtil.getSessionFactory().openSession();
        
    }
    
    public List<Jugadas> getAllJugadas(){
//        Date d=new Date();
//        SimpleDateFormat dateFormatGmt = new SimpleDateFormat("HH:mm:ss");
//        dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT-4"));
//        String horaactual = dateFormatGmt.format(d);
        
        Query q = sesion.createQuery("from Jugadas "); //where Hora>='"+horaactual+"'
        //"SELECT Descripcion,Hora,Hora_num FROM ruleta_activa_horas where Hora>'".$horactual.":00:00'";
        
        return q.list();
    }
}
