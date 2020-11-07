package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Order;
import br.com.alura.mvc.mudi.model.OrderStatus;
import br.com.alura.mvc.mudi.repository.OrderRepository;
import br.com.alura.mvc.mudi.util.UrlStatusConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public String index(Model model) {
        List<Order> orders = this.orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "home";
    }

    @GetMapping("/{status}")
    public ModelAndView listByStatus(@PathVariable("status") String status) {
        OrderStatus orderStatus = UrlStatusConverter.toEnum(status);
        List<Order> orders = this.orderRepository.findByStatus(orderStatus);

        ModelAndView model = new ModelAndView("home");
        model.addObject("orders", orders);

        return model;
    }
}
