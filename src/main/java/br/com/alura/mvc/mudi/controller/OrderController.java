package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.form.CreateOrderForm;
import br.com.alura.mvc.mudi.model.Order;
import br.com.alura.mvc.mudi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/pedidos")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping(path = "/formulario")
    public String form(CreateOrderForm form) {
        return "orders/form.html";
    }

    @PostMapping(path = "/novo")
    public String create(@Valid CreateOrderForm form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "orders/form.html";
        }

        Order order = form.toOrder();
        this.orderRepository.save(order);
        return "Salvo com sucesso";
    }
}
