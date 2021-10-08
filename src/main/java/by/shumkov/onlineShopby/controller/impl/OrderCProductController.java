package by.shumkov.onlineShopby.controller.impl;

import by.shumkov.onlineShopby.controller.OrderProductController;
import by.shumkov.onlineShopby.entity.Phone;
import by.shumkov.onlineShopby.entity.User;
import org.springframework.ui.Model;

public class OrderCProductController implements OrderProductController {
    @Override
    public String showOrder(User user, Model model) {
        return null;
    }

    @Override
    public String createOrder(User user, Phone phone, Model model) {
        return null;
    }
}
