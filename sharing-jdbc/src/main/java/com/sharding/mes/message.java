package com.sharding.mes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class message<T> {
    String code;
    String Description;
    T body;
    public static <T>message<T> MesBulid(String code,String Description,T body)
    {
        return new message<T>(code,Description,body);
    }
}
