package com.kafka.producer.springbootkafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author mzwandile on 2020/02/17
 * @project kafka
 */

@Data
@AllArgsConstructor
public class User {

    private String name;
    private String dept;
    private Long salary;

}
