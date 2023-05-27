package io.codelex.oop.imperialToMetric;

public class imperialToMetricApp {
    public static void main(String[] args) {
        System.out.println(MeasurementConverter.convert(100, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println(MeasurementConverter.convert(100, ConversionType.METERS_TO_YARDS));
        System.out.println(MeasurementConverter.convert(100, ConversionType.YARDS_TO_METERS));
        System.out.println(MeasurementConverter.convert(100, ConversionType.INCHES_TO_CENTIMETERS));
        System.out.println(MeasurementConverter.convert(100, ConversionType.KILOMETERS_TO_MILES));
        System.out.println(MeasurementConverter.convert(100, ConversionType.MILES_TO_KILOMETERS));
    }
}
