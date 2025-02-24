package me.dio.domain.model;

import java.math.BigDecimal;

public class Account {
    private Long id;
    private BigDecimal cash;
    private int card_items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public int getCard_items() {
        return card_items;
    }

    public void setCard_items(int card_items) {
        this.card_items = card_items;
    }
}
