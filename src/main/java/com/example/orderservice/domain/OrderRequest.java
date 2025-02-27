package com.example.orderservice.domain;

import lombok.Data;

@Data
public class OrderRequest {

    private Long userId;

    private Long bookId;
}