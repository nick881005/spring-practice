package com.practice.service;

import com.practice.model.Meal;
import org.springframework.stereotype.Service;
import com.practice.model.Order;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    List<Order> orderList = new ArrayList<>();

    public OrderService(List<Order> orderList) {
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal("hamburger", 1000, "This is delicious"));
        this.orderList.add(new Order("1", 1000, "Bill", meals));
        this.orderList.add(new Order("2", 3000, "Bill", meals));
    }

    public Order getOrderBySeq(String seq) {
        for (int i = 0; i < this.orderList.size(); i++) {
            if (this.orderList.get(i).getSeq().equals(seq)) {
                return this.orderList.get(i);
            }

        }
        return null;
    }
}


