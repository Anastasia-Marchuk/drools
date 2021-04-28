package com.javadrools.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.javadrools.model.Publication;

public class DroolsTest {

    public static final void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rule");

            Publication publication = new Publication();
            publication.setType("journal");

            FactHandle fact1;

            fact1 = kSession.insert(publication);
            kSession.fireAllRules();

            System.out.println("The discount for the publication "
                    + publication.getType() + " is " + publication.getDiscount());

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
