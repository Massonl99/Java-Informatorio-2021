package EjerciciosComplementariosLevel3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Alumno {
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDay;
    
    public Alumno(String firstName, String lastName, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }
    public String getFullName() {
            return firstName + " " + lastName;
        }
    public Integer getAge() {
        return Period.between(birthDay,
                LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()))
        ).getYears();
    }
}