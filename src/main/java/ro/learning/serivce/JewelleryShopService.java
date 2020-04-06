package ro.learning.serivce;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.learning.model.Product;

@Service
public class JewelleryShopService {

    private final KieContainer kieContainer;

    @Autowired
    public JewelleryShopService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Product getProductDiscount(Product product) {
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(product);
        kieSession.fireAllRules();
        kieSession.dispose();
        return product;
    }
}
