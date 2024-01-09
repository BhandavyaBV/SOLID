package org.example.good.S;

public class StudentDAO {
        private String firstName;
        private String lastName;
        private long phoneNumber;
        private int age;
        private String emailId;
        private String uniqueID;

    public StudentDAO(String firstName, String lastName, long phoneNumber, int age, String emailId, String uniqueID, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.emailId = emailId;
        this.uniqueID = uniqueID;
        this.address = address;
    }

        public String getLastName() {
            return lastName;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmailId() {
            return emailId;
        }

        public String getUniqueID() {
            return uniqueID;
        }

        public String getAddress() {
            return address;
        }

        private String address;

        public String getFirstName() {
            return firstName;
        }
}
