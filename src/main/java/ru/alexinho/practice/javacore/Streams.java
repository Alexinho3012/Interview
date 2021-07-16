package ru.alexinho.practice.javacore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Baggage> baggages = new ArrayList<>();
        baggages.add(new Baggage("Fly Emirates", "Business", 100));
        baggages.add(new Baggage("Pobeda", "1", 30));
        baggages.add(new Baggage("S7", "1", 80));
        baggages.add(new Baggage("Ural lines", "2", 110));
        baggages.add(new Baggage("British Airlines", "2", 50));

        baggages.stream()
                .sorted(Comparator.comparingInt(o -> o.maxBaggageWeight))
                .forEach(baggage -> System.out.println(baggage.toString()));

        baggages.stream()
                .map(o -> o.transporterName + o.flightClass)
                .sorted((o1, o2) -> o2.length() - o1.length())
                .forEach(o -> System.out.println(o));
    }

    public static class Baggage {

        String transporterName;
        String flightClass;
        int maxBaggageWeight;

        public Baggage(String transporterName, String flightClass, int maxBaggageWeight) {
            this.transporterName = transporterName;
            this.flightClass = flightClass;
            this.maxBaggageWeight = maxBaggageWeight;
        }

        @Override
        public String toString() {
            return "Baggage{" +
                    "transporterName='" + transporterName + '\'' +
                    ", flightClass='" + flightClass + '\'' +
                    ", maxBaggageWeight=" + maxBaggageWeight +
                    '}';
        }
    }
}
