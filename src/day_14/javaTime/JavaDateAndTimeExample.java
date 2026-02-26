package day_14.javaTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public class JavaDateAndTimeExample {

    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate ontem = date.minusDays(1);
        System.out.println(ontem);

        LocalDate hojeMaisOito = date.plusDays(8);
        System.out.println(hojeMaisOito);

        LocalDate dataTransformada = LocalDate.of(2026,2,24);
        System.out.println(dataTransformada);

        LocalDateTime horaTransformada = dataTransformada.atTime(23, 20, 25);
        System.out.println(horaTransformada);

        LocalTime queHorasSao = LocalTime.now();
        System.out.println(queHorasSao);

        LocalTime horaTransformada2 = LocalTime.of(23,23,10);
        LocalTime adcionaHoras = horaTransformada2.plusHours(5);
        System.out.println(adcionaHoras);

        LocalTime adcionaMinutos = adcionaHoras.plusMinutes(20);
        System.out.println(adcionaMinutos);

        YearMonth anoMes = YearMonth.now();
        System.out.println(anoMes);

        String anoMesFormatado = anoMes.format(DateTimeFormatter.ofPattern("/MM/yy"));
        System.out.println(anoMesFormatado);



 }
}
