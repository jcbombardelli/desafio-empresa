package util;

import java.util.Calendar;
import java.util.Date;

public class Datetime {

    public static Date novaData(String dataDigitada) {

        Calendar calendario = Calendar.getInstance();
        calendario.getTime();

        // 20-05-2020
        // 20/05/2020
        // 2020/05/20
        // 05/20/2020
        String[] dataEmLista = dataDigitada.split("/");
        // dataEmLista[0] --> dia
        // dataEmLista[1] -- mes
        // dataEmLista[2] --> ano

        int dia = Integer.parseInt(dataEmLista[0]);
        int mes = Integer.parseInt(dataEmLista[1]);
        int ano = Integer.parseInt(dataEmLista[2]);

        // calendario.set(Calendar.DATE, dia);
        // calendario.set(Calendar.MONTH, mes);
        // calendario.set(Calendar.YEAR, ano);
        calendario.set(ano, mes, dia);

        return calendario.getTime();
    }

}