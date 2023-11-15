package sd.java.lab4;

import java.util.Arrays;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {
        // Created instances of EducationalInstitution
        EducationalInstitution university = new EducationalInstitution(
                "University of Oxford",
                "England",
                1096,
                23500,
                3600);
        EducationalInstitution college = new EducationalInstitution(
                "Harvard University",
                "USA",
                1636,
                21000,
                2100);
        EducationalInstitution school = new EducationalInstitution(
                "Eton College",
                "England",
                1440,
                1315,
                75);

        // Created arrays of EducationalInstitution
        EducationalInstitution[] institutionsByYear = {university, college, school};
        EducationalInstitution[] institutionsByName = {university, college, school};

        // Sorted the array by establishment year
        Arrays.sort(institutionsByYear, Comparator.comparingInt(EducationalInstitution::getEstablishmentYear));

        // Sorted the array by institution name
        Arrays.sort(institutionsByName, Comparator.comparing(EducationalInstitution::getInstitutionName));

        // Printed sorted array by year
        System.out.println("Sorted by Establishment Year:");
        for (EducationalInstitution institution : institutionsByYear) {
            System.out.println(institution.getInstitutionName() + " - " + institution.getEstablishmentYear());
        }

        // Printed sorted array by name
        System.out.println("\nSorted by Institution Name:");
        for (EducationalInstitution institution : institutionsByName) {
            System.out.println(institution.getInstitutionName() + " - " + institution.getEstablishmentYear());
        }

    }
}
