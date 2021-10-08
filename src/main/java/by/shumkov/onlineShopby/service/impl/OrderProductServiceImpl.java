package by.shumkov.onlineShopby.service.impl;

import by.shumkov.onlineShopby.entity.Order;
import by.shumkov.onlineShopby.entity.OrderProduct;
import by.shumkov.onlineShopby.entity.Phone;
import by.shumkov.onlineShopby.entity.User;
import by.shumkov.onlineShopby.service.OrderProductService;
import by.shumkov.onlineShopby.service.OrderServiceException;

import java.util.List;

public class OrderProductServiceImpl implements OrderProductService {
    @Override
    public List<Phone> findAllOrders(User user) {
        return null;
    }

    @Override
    public List<Phone> findByNumberOfOrder(String number) {
        return null;
    }

    @Override
    public Order addNewOrderProduct(OrderProduct orderProduct) throws OrderServiceException {
        return null;
    }
}
