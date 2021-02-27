package com.example.onlineshop.model;

public enum Status {
    out_of_stock("out_of_stock"),
    in_stock("in_stock"),
    running_low("running_low");

    private final String status;

    private Status(String status) {
        this.status = status;
    }
}
