package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
@RequestMapping("/api")
public class EdadController {
    @GetMapping("/{day}/{month}/{year}")
    public String calcularEdad(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        // Obtener la fecha actual

        // Primera parte: variable tipo LocalDate
        // segunda parte: llamando al método estático now() de la clase LocalDate
        LocalDate fechaActual = LocalDate.now();

        // Crear objeto LocalDate para la fecha de nacimiento proporcionada
//        creando una instancia de LocalDate
        LocalDate fechaNacimiento = LocalDate.of(year, month, day);

        // Calcular la edad usando la clase Period
//        creando una instancia de Period
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        // Obtener los componentes de la edad
        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        // Formatear la respuesta
//        public: modificador de acceso
//        static: modificador de clase
//        String, LocalDate: tipo de retorno
//        nombre del método, es el último
        String edad = String.format("Edad: %d años, %d meses y %d días", años, meses, dias);

        return edad;
    }

//    Esto de aquí no es parte del assignment

    @GetMapping("/fechaDeHoy")
    public String calcularFechaDeHoy() {
        LocalDate fechaActual = LocalDate.now();

        LocalDate fechaInicial = LocalDate.of(2024, 1, 1);
        Period periodo = Period.between(fechaInicial, fechaActual);
        int totalDays = periodo.getYears() * 365 + periodo.getMonths() * 30 + periodo.getDays();

        String diasCalculados = String.valueOf(totalDays);
        return diasCalculados;

    }

}
