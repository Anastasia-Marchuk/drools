//package com.javadrools.testing;
//
//import static org.junit.Assert.assertEquals;
//
//import com.javadrools.model.Publication;
//import org.junit.Before;
//import org.junit.Test;
//import org.kie.api.KieServices;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;
//import org.kie.api.runtime.rule.FactHandle;
//
//
//public class DiscountExcelTest {
//
//    private KieSession kSession;
//
//    @Before
//    public void setup() {
//
//        KieServices ks = KieServices.Factory.get();
//        KieContainer kContainer = ks.getKieClasspathContainer();
//        kSession = kContainer.newKieSession("ksession-rule");
//
//    }
//
//    @Test
//    public void testDiscount() {
//
//        Publication publication = new Publication();
//        publication.setType("journal");
//       // publication.setAuthor("Elsiever");
//        KieServices ks = KieServices.Factory.get();
//        KieContainer kContainer = ks.getKieClasspathContainer();
//        KieSession kSession = kContainer.newKieSession("ksession-rule");
//        FactHandle fact1 = kSession.insert(publication);
//        kSession.fireAllRules();
//        assertEquals(publication.getDiscount(),18);
//
//    }
//}
