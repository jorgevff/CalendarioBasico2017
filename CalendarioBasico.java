
/**
 * se crea la cabezera de la  clase
 */
public class CalendarioBasico
{
    //se inicializa el dia
    private int dia;
    //se inicializa el mes   
    private int mes;
    //se inicializa el año
    private int anio;

    /**
     * damos los valores de todos los parametros
     */
    public CalendarioBasico()
    {

        dia = 1;
        mes = 1;
        anio = 1;

    }
    /**
     * fijamos la fecha nueva
     */
    public void setFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
    {
        dia = nuevoDia;
        mes = nuevoMes;
        anio = nuevoAnio;
    }
    /**
     * permite avanzar de fecha 
     */
    public void avanzaFecha()
    {
        dia += 1;
        if(dia > 30){
            mes += 1;
            dia = 1;
            if(mes > 12){
                anio += 1;
                mes = 1;
                if(anio > 99){
                    dia = 1;
                    anio = 1;
                }
            }

        }
    }
}