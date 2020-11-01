package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        Order order = new Order();
        order.setProductName("Smartband Xiaomi Mi Band 5 Versão 2020");
        order.setDescription("Produto original na Amazon Brasil");
        order.setProductLink("https://www.amazon.com.br/gp/offer-listing/B08B1MGGYY/ref=sr_1_2_olp?linkCode=sl2&linkId=370746003c44767f656bd1c4a2cf07e2&keywords=mi+band+5&__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&qid=1604252295&sr=8-2&tag=canaltech-youtube-20&dchild=1");
        order.setProductImageUrl("data:image/jpeg;base64,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");

        List<Order> orders = Arrays.asList(order, order);

        model.addAttribute("orders", orders);
        return "home";
    }
}
