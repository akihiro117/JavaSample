import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * 356: Enhanced Pseudo-Random Number Generators
 */
public class PseudoRandomNumber {
    public static void main(String[] args) {

        // RandomGeneratorFactory#of でアルゴリズムを選択して疑似乱数生成器を作成できるようになった。
        // 選択できるアルゴリズムの一覧: https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/random/package-summary.html#algorithms
        // StateBitsが大きいものほど周期が長い。
        RandomGeneratorFactory<RandomGenerator> randomGeneratorFactory1 = RandomGeneratorFactory.of("Random");
        RandomGenerator randomGenerator1 = randomGeneratorFactory1.create();
        randomGenerator1.nextInt();

        RandomGeneratorFactory<RandomGenerator> randomGeneratorFactory2 = RandomGeneratorFactory.of("L128X1024MixRandom");
        RandomGenerator randomGenerator2 = randomGeneratorFactory2.create();
        randomGenerator2.nextInt();
    }
}
