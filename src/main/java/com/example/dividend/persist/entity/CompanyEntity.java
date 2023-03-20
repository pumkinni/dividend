package com.example.dividend.persist.entity;


import com.example.dividend.model.Company;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "COMPANY")
@Getter
@ToString
@NoArgsConstructor
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Long id;

    @Column(unique = true)
    private String ticker;

    private String name;

    public CompanyEntity(Company company){
        this.name = company.getName();
        this.ticker = company.getTicker();
    }

}
