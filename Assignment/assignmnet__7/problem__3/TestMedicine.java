package assignment.assignmnet__7.problem__3;

import java.util.Random;

public class TestMedicine {
    public static void main(String[] args) {
        Medicine[] meds = new Medicine[10];
        Random rand = new Random();

        // Sample companies
        String[] companies = {
            "PanLogic Pharma", "MediLife Ltd.", "CureWell Inc.",
            "HealFast Remedies", "BioHealth Corp.", "GreenMed Labs",
            "Wellness Drugs", "NovaPharm", "CarePlus", "HealthBridge"
        };

        String[] addresses = {
            "123 Pharma Street", "45 Wellness Blvd", "678 MedPark Lane",
            "99 Cure Zone", "101 BioCity", "32 GreenCross Ave",
            "77 Vital Road", "88 Nova Park", "55 Healing Way", "200 Bridge Lane"
        };

        for (int i = 0; i < meds.length; i++) {
            int type = rand.nextInt(3) + 1; // 1 to 3
            String company = companies[i % companies.length];
            String address = addresses[i % addresses.length];

            switch (type) {
                case 1:
                    meds[i] = new Tablet(company, address);
                    break;
                case 2:
                    meds[i] = new Syrup(company, address);
                    break;
                case 3:
                    meds[i] = new Ointment(company, address);
                    break;
            }
        }

        // Display info
        for (int i = 0; i < meds.length; i++) {
            System.out.println("Medicine " + (i + 1) + ":");
            meds[i].displayLabel();
        }
    }
}
