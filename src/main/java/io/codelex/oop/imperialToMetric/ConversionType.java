package io.codelex.oop.imperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS(new Converter() {
        @Override
        public double convert(double value) {
            return value * 1.09361;
        }
    }),
    YARDS_TO_METERS(new Converter() {
        @Override
        public double convert(double value) {
            return value / 1.09361;
        }
    }),
    CENTIMETERS_TO_INCHES(new Converter() {
        @Override
        public double convert(double value) {
            return value * 0.393701;
        }
    }),
    INCHES_TO_CENTIMETERS(new Converter() {
        @Override
        public double convert(double value) {
            return value / 0.393701;
        }
    }),
    KILOMETERS_TO_MILES(new Converter() {
        @Override
        public double convert(double value) {
            return value * 0.621371;
        }
    }),
    MILES_TO_KILOMETERS(new Converter() {
        @Override
        public double convert(double value) {
            return value / 0.621371;
        }
    });

    private Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return converter;
    }
}