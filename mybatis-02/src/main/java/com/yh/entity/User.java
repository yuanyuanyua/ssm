package com.yh.entity;


import lombok.Getter;
import lombok.*;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/1/25 13:30
 * @Version：
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String name;
    private String pwd;
}
