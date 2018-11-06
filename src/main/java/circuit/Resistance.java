package circuit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
    A class to calculate the total resistance in an electric circuit with an arbitrary 
    combination of resistors in series and parallel, using Composition pattern.
*/
public class Resistance {
    private double value;
    private List<Resistance> inSeries = new ArrayList<>();
    private List<Resistance> inParallel = new ArrayList<>();

    public Resistance(double value) {
        this.value = value;
    }

    public Resistance addInSeries(Resistance r) {
        Resistance newResistance = new Resistance(this.getValue());
        newResistance.inSeries.add(r);
        return newResistance;
    }

    public Resistance addInParallel(Resistance r) {
        Resistance newResistance = new Resistance(this.getValue());
        newResistance.inParallel.add(r);
        return newResistance;
    }

    public double getValue() {
        if (inSeries.isEmpty() && inParallel.isEmpty())
            return value;

        double seriesValue = inSeries.stream().map(r -> r.value).reduce(0.0, (a, b) -> a + b);
        seriesValue += value;

        List<Double> parallelToCalculate = inParallel.stream().map(r -> r.value).filter(v -> v > 0).collect(Collectors.toList());
        parallelToCalculate.add(seriesValue);

        double parallelValue = parallelToCalculate.stream()
                .map(r -> (1 / r)).reduce(0.0, (a, b) -> a + b);
        return 1 / parallelValue;
    }
}
