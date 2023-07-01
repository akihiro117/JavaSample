import jdk.incubator.vector.DoubleVector;
import jdk.incubator.vector.VectorSpecies;

import java.util.Arrays;

public class VectorApi {
    public static void main(String[] args) {
        // 一度に計算するbit数
        VectorSpecies<Double> species = DoubleVector.SPECIES_128;

        double[] targetArray = new double[]{0.1, 0.2};
        DoubleVector doubleVector = DoubleVector.fromArray(species, targetArray,0);
        // 配列の要素に対して同時に0.3を加算する。
        DoubleVector calculatedDoubleVector = doubleVector.add(0.3);
        double[] resultArray = new double[targetArray.length];
        // 計算結果を配列に入れる。
        calculatedDoubleVector.intoArray(resultArray, 0);
        // 0.4, 0.5
        Arrays.stream(resultArray).forEach(System.out::println);
    }
}
