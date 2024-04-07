import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 複数のListを1つのListにまとめるサンプル。
 * JDK17
 */
public class MergeMultipleListIntoSingleList {
    public static void main(String[] args) {
        System.out.println("Listの格納されたオブジェクトのインスタンス変数のListを1つのListにまとめるサンプル");
        List<Sample> sampleList = Arrays.asList(
                new Sample(1 ,Arrays.asList("name1", "name10")),
                new Sample(2 ,Arrays.asList("name2", "name20", "name200"))
                );
        List<String> nameList = sampleList.stream().flatMap(sample -> sample.name().stream()).toList();
        System.out.println(nameList.size());
        nameList.forEach(System.out::println);

        System.out.println();

        System.out.println("多次元Listを1つのListにまとめるサンプル");
        List<List<String>> multidimensionalList = Arrays.asList(
                Arrays.asList("name1", "name10", "name100"),
                Arrays.asList("name2", "name20", "name200"),
                Arrays.asList("name3", "name30", "name300")
        );
        List<String> nameList2 = multidimensionalList.stream().flatMap(Collection::stream).toList();
        System.out.println(nameList2.size());
        nameList2.forEach(System.out::println);
    }

    record Sample(Integer id, List<String> name) {
    }
}
