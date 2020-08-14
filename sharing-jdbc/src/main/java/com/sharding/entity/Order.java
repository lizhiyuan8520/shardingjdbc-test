package com.sharding.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    long order_id;
    int user_id;
    String description;
    Timestamp create_time;
}
