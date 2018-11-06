package circuit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResistanceTest {

    @Test
    public void shouldAddUpSeriesResistances() {
        Resistance r = new Resistance(3);

        Resistance circuit = r.addInSeries(r);
        assertEquals(6, circuit.getValue(), 0);
    }

    @Test
    public void shouldCalculateParallelResistances() {
        Resistance r = new Resistance(3);

        Resistance circuit = r.addInParallel(r);
        assertEquals(1.5, circuit.getValue(), 0);
    }

    @Test
    public void shouldCalculateBothSeriesAndParallelResistances1() {
        Resistance r = new Resistance(2);

        Resistance circuit = r.addInParallel(r).addInSeries(r).addInSeries(r);

        assertEquals(5, circuit.getValue(), 0);
    }

    @Test
    public void shouldCalculateBothSeriesAndParallelResistances2() {
        Resistance r1 = new Resistance(2);
        Resistance r2 = new Resistance(4);

        Resistance circuit = r1.addInSeries(r1).addInParallel(r2).addInSeries(r1);

        assertEquals(4, circuit.getValue(), 0);
    }
}
