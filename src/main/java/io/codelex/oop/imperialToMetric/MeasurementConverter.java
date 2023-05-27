package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public static double convert(int value, ConversionType conversionType) {
        return conversionType.getConverter().convert(value);
    }
}