package edu.parinya.softarchdesign.structural;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {
        members = new LinkedHashSet<>();
    }


    public void addMember(HealthcareServiceable worker){
        members.add(worker);
    }

    public void removeMember(HealthcareServiceable worker){
        members.remove(worker);
    }


    public void service() {
        for (HealthcareServiceable count : members)
        {
            count.service();
        }
    }

    @Override
    public double getPrice() {
        double price = 0;

        for (HealthcareServiceable count : members)
        {
            price += count.getPrice();
        }

        return price;
    }
}
