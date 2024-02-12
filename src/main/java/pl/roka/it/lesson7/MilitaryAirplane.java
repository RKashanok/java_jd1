package pl.roka.it.lesson7;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import pl.roka.it.lesson7.Airplane;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class MilitaryAirplane extends Airplane {

    public static int a = 50;
    public static int b = Airplane.b;

    public final int c;

    String operationsType;
    boolean isInvisible;

    public MilitaryAirplane() {
        super();
        isInvisible = getLength() > getTurbineNum();
        c = 202;
        setTurbineNum(4);
    }

    @Override
    public void test() {
        System.out.println("From MilitaryAirplane");
    }

}
