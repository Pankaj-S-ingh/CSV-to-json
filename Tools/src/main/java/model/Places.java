package model;


import java.util.List;

public class Places {

        private String place;

        private Integer  main_pincode;

        private Integer sub_pincode;

        private String address;

        private List<Double>  location;

        private String type;

        private String rating;

        private String diety;
        private Long contact_number;

        private String validate;

        private String best_time_to_Visit;

        private String opening_and_closing_time;

        private String best_month_to_visit;

        private String best_whether_to_visit;

        private String best_age_to_visit;

        public Places(String place, Integer main_pincode, Integer sub_pincode, String address,List<Double>  location, String type, String rating, String diety, Long contact_number, String validate, String best_time_to_Visit, String opening_and_closing_time, String best_month_to_visit, String best_whether_to_visit, String best_age_to_visit) {
                this.place = place;
                this.main_pincode = main_pincode;
                this.sub_pincode = sub_pincode;
                this.address = address;
                this.location=location;
                this.type = type;
                this.rating = rating;
                this.diety = diety;
                this.contact_number = contact_number;
                this.validate = validate;
                this.best_time_to_Visit = best_time_to_Visit;
                this.opening_and_closing_time = opening_and_closing_time;
                this.best_month_to_visit = best_month_to_visit;
                this.best_whether_to_visit = best_whether_to_visit;
                this.best_age_to_visit = best_age_to_visit;
        }

        public Places(List<List<String>> readCSV) {
        }

        public String getPlace() {
                return place;
        }

        public Integer getMain_pincode() {
                return main_pincode;
        }

        public Integer getSub_pincode() {
                return sub_pincode;
        }

        public String getAddress() {
                return address;
        }

        public List<Double>  getLocation() {
                return location;
        }

        public String getType() {
                return type;
        }

        public String getRating() {
                return rating;
        }

        public String getDiety() {
                return diety;
        }

        public Long getContact_number() {
                return contact_number;
        }

        public String getValidate() {
                return validate;
        }

        public String getBest_time_to_Visit() {
                return best_time_to_Visit;
        }

        public String getOpening_and_closing_time() {
                return opening_and_closing_time;
        }

        public String getBest_month_to_visit() {
                return best_month_to_visit;
        }

        public String getBest_whether_to_visit() {
                return best_whether_to_visit;
        }

        public String getBest_age_to_visit() {
                return best_age_to_visit;
        }
}


