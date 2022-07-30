package com.practice.controller;


import com.practice.model.Order;
import com.practice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/{seq}")
    public String getOrderSeq(@PathVariable String seq, Model model){
        Order order = this.orderService.getOrderBySeq(seq);
        model.addAttribute("order",order);
        return "order";
    }
}
