
package persistencia.servicio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.hibernate.*;
import persistencia.entidad.RuletaActivaHoras;

public class ServicioRuletaActivaHoras {
    private Session sesion;

    public ServicioRuletaActivaHoras() {
        sesion = RuletaActivaHorasHibernateUtil.getSessionFactory().openSession();
        
    }
    public List<RuletaActivaHoras> getAllRuletaActivaHoras(){
        Date d=new Date();
        SimpleDateFormat dateFormatGmt = new SimpleDateFormat("HH:mm:ss");
        dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        String horaactual = dateFormatGmt.format(d);
        
//        String horaactual = Integer.toString(dateFormatGmt.getTimeZone());
         
////        System.out.println(Integer.toString(d.getHours())); 
//
//        String horaactual = Integer.toString(d.getHours());
        

        //Selecciona los sorteos dependiendo la hora de la jugadas
        //Query q = sesion.createQuery("from RuletaActivaHoras where Hora>='"+horaactual+"'");
        
        //Para programar sin importar la hora uso este
        Query q = sesion.createQuery("from RuletaActivaHoras");
        //"SELECT Descripcion,Hora,Hora_num FROM ruleta_activa_horas where Hora>'".$horactual.":00:00'";
        
        return q.list();
        
//        SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
//        dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT"));
//
//        //Local time zone   
//        SimpleDateFormat dateFormatLocal = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
//
//        //Time in GMT
//        return dateFormatLocal.parse( dateFormatGmt.format(new Date()) );
         

        
    }
}
