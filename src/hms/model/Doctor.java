package hms.model;

public class Doctor {
    private int doctorId;
    private String fullName;
    private String specialization;
    private String phone;
    private String email;
    private double consultationFee;
    private boolean available;
    private String photoPath;

    public Doctor() {
    }

    public Doctor(int doctorId, String fullName, String specialization, String phone,
                  String email, double consultationFee, boolean available, String photoPath) {
        this.doctorId = doctorId;
        this.fullName = fullName;
        this.specialization = specialization;
        this.phone = phone;
        this.email = email;
        this.consultationFee = consultationFee;
        this.available = available;
        this.photoPath = photoPath;
    }

    public int getDoctorId() { return doctorId; }
    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getConsultationFee() { return consultationFee; }
    public void setConsultationFee(double consultationFee) { this.consultationFee = consultationFee; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public String getPhotoPath() { return photoPath; }
    public void setPhotoPath(String photoPath) { this.photoPath = photoPath; }

    @Override
    public String toString() {
        return doctorId + " - Dr. " + fullName.replaceFirst("^Dr\\.?\\s*", "");
    }
}
