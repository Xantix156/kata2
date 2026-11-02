package software.ulpgc.katas;

import java.nio.charset.StandardCharsets;

public class Main {
    static void main() {
        String s = "¡Qué día!";
        byte[] utf = s.getBytes();
        byte[] iso = s.getBytes(StandardCharsets.ISO_8859_1);

        System.out.println("UTF-8 Coded & UTF-8 Decoded");
        System.out.println(new String(utf));
        System.out.println("UTF-8 Coded & ISO-8859-1 Decoded");
        System.out.println(new String(utf, StandardCharsets.ISO_8859_1));
        System.out.println("ISO-8859-1 Coded & UTF Decoded");
        System.out.println(new String(iso));
        System.out.println("ISO-8859-1 Coded & ISO-8859-1 Decoded");
        System.out.println(new String(iso, StandardCharsets.ISO_8859_1));
    }

}
