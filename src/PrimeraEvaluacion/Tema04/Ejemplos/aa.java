

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    public class aa {
        private static Scanner sc;

        private static LocalDate pideFecha(){

            System.out.print("Introduce una fecha (dd/MM/yyyy): ");
            String fechaTexto = sc.next();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(fechaTexto, formato);

            return fecha;

        }

        private static String capitalizarTexto(String texto) {
            String textoCapitalizado = Character.toUpperCase(texto.charAt(0)) + texto.substring(1).toLowerCase();

            return textoCapitalizado;
        }

        public static void main(String[] args) {

            sc = new Scanner(System.in);

            LocalDate fecha = pideFecha();
            DayOfWeek diaIngles = fecha.getDayOfWeek();
            String nombreDiaIngles = capitalizarTexto(diaIngles.name());

            System.out.printf("El día introducido ha sido %s", nombreDiaIngles);
        }

    }
