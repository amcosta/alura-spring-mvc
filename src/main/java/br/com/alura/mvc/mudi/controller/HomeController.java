package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Order;
import br.com.alura.mvc.mudi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/")
    public String index(Model model) {
        List<Order> orders = this.orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "home";
    }
}
