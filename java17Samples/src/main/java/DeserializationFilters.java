import java.util.Arrays;
import java.util.HexFormat;

public class DeserializationFilters {
    public static void main(String[] args) {
        // 0000000a
        System.out.println(HexFormat.of().toHexDigits(10));
        // 0000000A
        System.out.println(HexFormat.of().withUpperCase().toHexDigits(10));
        // 171
        System.out.println(HexFormat.fromHexDigits("ab"));
        // #01,#0a,#03
        System.out.println(HexFormat.ofDelimiter(",").withPrefix("#").formatHex(new byte[]{1,10,3}));
        // [1, 10, 3]
        System.out.println(Arrays.toString(HexFormat.ofDelimiter(",").withPrefix("#").parseHex("#01,#0a,#03")));
    }
}
