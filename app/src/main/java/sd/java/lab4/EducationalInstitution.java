package sd.java.lab4;

public class EducationalInstitution {
    private String institutionName;
    private String country;
    private int establishmentYear;
    private int numberOfStudents;
    private int numberOfTeachers;

    public EducationalInstitution(String institutionName, String country, int establishmentYear, int numberOfStudents, int numberOfTeachers) {
        // Validate and set the institution name
        setInstitutionName(institutionName);

        // Validate and set the location
        setCountry(country);

        // Set the establishment year
        setEstablishmentYear(establishmentYear);
        // Validate and set the number of students
        setNumberOfStudents(numberOfStudents);

        // Validate and set the number of teachers
        setNumberOfTeachers(numberOfTeachers);
    }

    // Getters
    public String getInstitutionName() {
        return institutionName;
    }

    public String getCountry() {
        return country;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    // Setters with validation
    public void setInstitutionName(String institutionName) {
        // Validate and set the institution name
        if (isValidString(institutionName)) {
            this.institutionName = institutionName;
        } else {
            throw new IllegalArgumentException("Invalid institution name.");
        }
    }

    public void setCountry(String country) {
        // Validate and set the location
        if (isValidString(country)) {
            this.country = country;
        } else {
            throw new IllegalArgumentException("Invalid location.");
        }
    }

    public void setEstablishmentYear(int establishmentYear) {
        // Set the establishment year
        this.establishmentYear = establishmentYear;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        // Validate and set the number of students
        if (numberOfStudents >= 0) {
            this.numberOfStudents = numberOfStudents;
        } else {
            throw new IllegalArgumentException("Number of students must be a non-negative integer.");
        }
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        // Validate and set the number of teachers
        if (numberOfTeachers >= 0) {
            this.numberOfTeachers = numberOfTeachers;
        } else {
            throw new IllegalArgumentException("Number of teachers must be a non-negative integer.");
        }
    }

    // Validates that a given string is not null and contains non-whitespace characters.
    private boolean isValidString(String s) {
        return s != null && !s.trim().isEmpty();
    }
}
