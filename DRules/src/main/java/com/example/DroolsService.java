//

package com.example;
import com.example.model.Droga;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
//import org.kie.api.event.rule.DefaultAgendaEventListener;
//import org.kie.api.event.rule.AfterMatchFiredEvent;
//import org.kie.api.event.rule.DebugAgendaEventListener;

public class DroolsService {

    public void executeDrools(Droga droga1, String klasa) {

        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("rulesKS");

        if (kSession == null) {
            System.err.println("Kie nie działa");
        }

        assert kSession != null;
        kSession.insert(droga1);
        int rulesFired = kSession.fireAllRules();

//        kSession.addEventListener(new DefaultAgendaEventListener() {
//            @Override
//            public void afterMatchFired(AfterMatchFiredEvent event) {
//                super.afterMatchFired(event);
//                System.out.println("Reguła uruchomiona: " + event.getMatch().getRule().getName());
//            }
//        });

        System.out.println("Liczba uruchomionych reguł: " + rulesFired);
        System.out.println("Liczba VW " + droga1.getWartoscVW());

        if (droga1.getWartoscVW() > 4)
        {
            System.out.println("Przydzielona klasa oświetlenia to: " + klasa + "1");
        }
        else if (droga1.getWartoscVW() == 4)
        {
            System.out.println("Przydzielona klasa oświetlenia to: " + klasa + "2");
        }
        else if (droga1.getWartoscVW() == 3)
        {
            System.out.println("Przydzielona klasa oświetlenia to: " + klasa + "3");
        }
        else if (droga1.getWartoscVW() == 2)
        {
            System.out.println("Przydzielona klasa oświetlenia to: " + klasa + "4");
        }
        else if (droga1.getWartoscVW() == 1)
        {
            System.out.println("Przydzielona klasa oświetlenia to: " + klasa + "5");
        }
        else {
            System.out.println("Przydzielona klasa oświetlenia to: " + klasa + "6");
        }

        kSession.dispose();
    }
}