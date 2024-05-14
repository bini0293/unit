public class WeightConverter {
    public static double kilogramToGram(double kilogram) {
        return kilogram * 1000;
    }

    public static double gramToKilogram(double gram) {
        return gram / 1000;
    }

    public static double milligramToGram(double milligram) {
        return milligram / 1000;
    }

    public static double gramToMilligram(double gram) {
        return gram * 1000;
    }

    public static double milligramToKilogram(double milligram) {
        return milligram / 1_000_000;
    }

    public static double kilogramToMilligram(double kilogram) {
        return kilogram * 1_000_000;
    }

    public static double poundToKilogram(double pound) {
        return pound * 0.453592;
    }

    public static double kilogramToPound(double kilogram) {
        return kilogram / 0.453592;
    }

    public static double poundToGram(double pound) {
        return pound * 453.592;
    }

    public static double gramToPound(double gram) {
        return gram / 453.592;
    }

    public static double poundToMilligram(double pound) {
        return pound * 453_592.37;
    }

    public static double milligramToPound(double milligram) {
        return milligram / 453_592.37;
    }

    public static void main(String[] args) {
        double kilograms = 5;
        double grams = kilogramToGram(kilograms);
        System.out.println(kilograms + " kilograms = " + grams + " grams");

        double grams2 = 2000;
        double kilograms2 = gramToKilogram(grams2);
        System.out.println(grams2 + " grams = " + kilograms2 + " kilograms");

        double milligrams = 3000;
        double grams3 = milligramToGram(milligrams);
        System.out.println(milligrams + " milligrams = " + grams3 + " grams");

        double grams4 = 5000;
        double milligrams2 = gramToMilligram(grams4);
        System.out.println(grams4 + " grams = " + milligrams2 + " milligrams");

        double milligrams3 = 8000;
        double kilograms3 = milligramToKilogram(milligrams3);
        System.out.println(milligrams3 + " milligrams = " + kilograms3 + " kilograms");

        double kilograms4 = 10;
        double milligrams4 = kilogramToMilligram(kilograms4);
        System.out.println(kilograms4 + " kilograms = " + milligrams4 + " milligrams");

        double pounds = 25;
        double kilograms5 = poundToKilogram(pounds);
        System.out.println(pounds + " pounds = " + kilograms5 + " kilograms");

        double kilograms6 = 30;
        double pounds2 = kilogramToPound(kilograms6);
        System.out.println(kilograms6 + " kilograms = " + pounds2 + " pounds");

        double pounds3 = 35;
        double grams5 = poundToGram(pounds3);
        System.out.println(pounds3 + " pounds = " + grams5 + " grams");

        double grams6 = 4000;
        double pounds4 = gramToPound(grams6);
        System.out.println(grams6 + " grams = " + pounds4 + " pounds");

        double pounds5 = 45;
        double milligrams5 = poundToMilligram(pounds5);
        System.out.println(pounds5 + " pounds = " + milligrams5 + " milligrams");

        double milligrams6 = 5000;
        double pounds6 = milligramToPound(milligrams6);
        System.out.println(milligrams6 + " milligrams = " + pounds6 + " pounds");
    }
}
