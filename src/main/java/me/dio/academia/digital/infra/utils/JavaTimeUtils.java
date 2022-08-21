package me.dio.academia.digital.infra.utils;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaTimeUtils {

    public static Locale LOCALE_BR = new Locale("pt", "BR");
    public static DateTimeFormatter LOCAL_DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy", LOCALE_BR);
}
