package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * (Test)实体类
 *
 * @author makejava
 * @since 2020-03-01 15:17:52
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Test{
    private Integer id;
    
    private String name;
    
    private Integer score;
}