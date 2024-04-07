import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinSample {
    public static void main(String[] args) {
        System.out.println("独自オブジェクトのListから特定の値が最小のオブジェクトを見つけるサンプル");
        List<Sample> sampleList = Arrays.asList(
                new Sample(1, Arrays.asList(10, 11, 5)),
                new Sample(2, Arrays.asList(3, 13, 7)),
                new Sample(3, Arrays.asList(4, 20))
                );
        Sample minSample = sampleList.stream().min(Comparator.comparingInt(sample -> sample.age().stream().min(Comparator.naturalOrder()).get())).get();
        System.out.println(minSample.id + "," + minSample.age());
    }

    record Sample(Integer id, List<Integer> age) {
    }
}
