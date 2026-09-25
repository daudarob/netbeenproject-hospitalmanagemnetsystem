package hms.model;

/**
 * Simple data holder (POJO) representing one row of the patients table.
 */
public class Patient {
    private int patientId;
    private String fullName;
    private int age;
    private String gender;
    private String bloodGroup;
    private String phone;
    private String address;
    private boolean admitted;
    private String photoPath;

    public Patient() {
    }

    public Patient(int patientId, String fullName, int age, String gender, String bloodGroup,
                   String phone, String address, boolean admitted, String photoPath) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.phone = phone;
        this.address = address;
        this.admitted = admitted;
        this.photoPath = photoPath;
    }

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public boolean isAdmitted() { return admitted; }
    public void setAdmitted(boolean admitted) { this.admitted = admitted; }

    public String getPhotoPath() { return photoPath; }
    public void setPhotoPath(String photoPath) { this.photoPath = photoPath; }

    @Override
    public String toString() {
        return patientId + " - " + fullName;
    }
}
