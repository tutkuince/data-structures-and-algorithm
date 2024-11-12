package io.tince.exercises.order;

import java.util.*;

public class Solution {
    private static Map<String, Order> supplierIdSeasonCodeOrderMap = new HashMap<>();

    public static void main(String[] args) {
        // Create articles and add to basket
        Article article1 = new Article();
        article1.id = "1";
        article1.name = "T-shirt";
        article1.supplierId = "1";
        article1.seasonCode = "SS25";
        addToBasket(article1, 2);

        Article article2 = new Article();
        article1.id = "2";
        article1.name = "Shirt";
        article1.supplierId = "1";
        article1.seasonCode = "SS25";
        addToBasket(article2, 3);
    }

    public static void addToBasket(Article article, Integer qty) {
        // Implement me
        String combination = article.supplierId + "," + article.seasonCode;

        if(!supplierIdSeasonCodeOrderMap.containsKey(combination)) {
            OrderItem oi = new OrderItem();
            oi.articleId = article.id;
            oi.qty = qty;

            List<OrderItem> orderItemList = new ArrayList<>();
            orderItemList.add(oi);

            Order order = new Order();
            order.id = UUID.randomUUID().toString();
            order.items = orderItemList;
            order.supplierId = article.supplierId;
            order.seasonCode = article.seasonCode;
            order.status = "DRAFT";
            supplierIdSeasonCodeOrderMap.put(combination, order);
        } else {
            Order order = supplierIdSeasonCodeOrderMap.get(combination);
            OrderItem oi = new OrderItem();
            oi.articleId = article.id;
            oi.qty = qty;
            order.items.add(oi);
        }
    }
}

class Article {
    public String id;
    public String name;
    public String supplierId;
    public String seasonCode;
}

class Order {
    public String id;
    public List<OrderItem> items;
    public String supplierId;
    public String seasonCode;
    public String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(supplierId, order.supplierId) && Objects.equals(seasonCode, order.seasonCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, seasonCode);
    }
}

class OrderItem {
    public String articleId;
    public Integer qty;
}
