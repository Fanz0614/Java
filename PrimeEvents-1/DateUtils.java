import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * This class provide a function that generate and return the current date and time 
 * information format "yyyy-MM-dd HH:mm:ss".
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class DateUtils 
{
    private static DateUtils dateUtils = null;
    private Calendar calendar;
    private SimpleDateFormat sdf;

    public static DateUtils getInstance(){
        if (dateUtils==null) {
            dateUtils=new DateUtils();
        }
        return dateUtils;
    }

    /**
     * get current date and time
     * @param format "yyyy-MM-dd HH:mm:ss"
     * @return give back current date and time
     */
    public String getNowDate(String format){
        sdf = new SimpleDateFormat(format);
        return sdf.format(new Date());
    }    
}