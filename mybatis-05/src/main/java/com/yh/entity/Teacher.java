package com.yh.entity;

import lombok.Setter;
import lombok.*;

import java.util.List;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/1/25 18:08
 * @Version：
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
