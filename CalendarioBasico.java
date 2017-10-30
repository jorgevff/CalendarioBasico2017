
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
}