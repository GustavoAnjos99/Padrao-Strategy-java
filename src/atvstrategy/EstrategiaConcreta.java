package atvstrategy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EstrategiaConcreta implements Estrategia{
    private final GregorianCalendar data = new GregorianCalendar();
    private final int dia = data.get(Calendar.DAY_OF_WEEK);
    private final String[] diaSemana = {"domingo", "segunda", "terca", "quarta", "quinta", "sexta", "sabado"};
    
    @Override
    public String mensagemDoDia(){
        return"hoje e "+ diaSemana[dia-1];
    }
}

