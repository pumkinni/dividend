package com.example.dividend.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Company {

    private String ticker;
    private String name;
}
