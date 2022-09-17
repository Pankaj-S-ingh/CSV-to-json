package model;

import java.util.List;



public class Location {
        private List<Double> coordinates;

        public Location(List<Double> coordinates) {
                this.coordinates = coordinates;
        }

        public List<Double> getCoordinates() {
                return coordinates;
        }
}
