package ro.learning.controller;

import ro.learning.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.learning.serivce.JewelleryShopService;

import java.io.FileNotFoundException;

@RestController
public class JewelleryShopController {

    private final JewelleryShopService jewelleryShopService;

    @Autowired
    public JewelleryShopController(JewelleryShopService jewelleryShopService) {
        this.jewelleryShopService = jewelleryShopService;
    }

    @RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
    public Product getQuestion(@RequestParam(required = true) String type) throws FileNotFoundException {
        Product product = new Product();
        product.setType(type);
        jewelleryShopService.getProductDiscount(product);
        return product;
    }
}
