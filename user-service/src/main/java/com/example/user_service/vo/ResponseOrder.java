package com.example.user_service.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseOrder {
    private String productId; //제품 id
    private Integer qty; //수량
    private Integer unitPrice; //단가
    private Integer totalPrice; //총금액
    private Date createdAt; //주문날짜
    private String orderId; //주문 id
}
