package com.wipro.medicine.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "category_tbl")
@Data
@Getter
@Setter
public class Category {
    
    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int categoryId;
    
    @Column(name="category_name", length = 20)
    @NotNull
    private String categoryName;
    
    @OneToMany(mappedBy = "category")
    @JsonIgnore // Prevent circular reference
    private List<Medicine> medicines;

	

    
}
