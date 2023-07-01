public class PatternMatchingForSwitch {
    public static void main(String[] args) {

        System.out.println(test("test")); // 文字列
        Integer testInteger1 = 1;
        System.out.println(test(testInteger1)); // 正の数
        Integer testInteger2 = -1;
        System.out.println(test(testInteger2)); // 負の数
        Double testDouble = 1.2;
        System.out.println(test(testDouble)); // double
        System.out.println(test(1.2)); // double
        System.out.println(test(0)); // 該当なし
        System.out.println(test(null)); // null
    }

    private static String test(Object obj) {
        return switch (obj) {
            case String str -> "文字列";
            // パターンマッチした変数を使って、追加の条件を指定できる。java19ではwhenを使う。
            case Integer integer && integer > 0 -> "正の数";
            case Integer integer && integer < 0 -> "負の数";
            case Double db -> "double";
            // case にnullを指定できる。
            case null -> "null";
            default -> "該当なし";
        };
    }
}
