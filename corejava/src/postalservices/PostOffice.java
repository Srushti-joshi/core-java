package postalservices;

public class PostOffice {

        private int officeId;
        private String location;

        // Public Getters
        public int getOfficeId() { return officeId; }
        public String getLocation() { return location; }

        // Package-private Setters (Accessible within the same package)
        void setOfficeId(int officeId) { this.officeId = officeId; }
        void setLocation(String location) { this.location = location; }

}
