package tocman.classes;

import java.util.Locale;

public class FuncUtils {
    private static final String DEFAULT_FORMAT = "%6.2f";

    public static String floatFormat(double number){
        return format(number, DEFAULT_FORMAT);
    }

    public static String floatFormat(double number, String format){

        return format(number, format);
    }

    private static String format(double number, String format) {
        Locale locale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        String result = String.format(format, number);
        Locale.setDefault(locale);
        return result;
    }
}
