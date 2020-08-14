package com.sharding.Algorithm;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.ShardingValue;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.*;

@Slf4j
public class ComplexKeysSharding implements ComplexKeysShardingAlgorithm {



    public Collection<String> doSharding(Collection collection, ComplexKeysShardingValue complexKeysShardingValue) {
        log.info("collection:" + collection + ",shardingValues:" + complexKeysShardingValue);
        Integer order_id=(Integer) complexKeysShardingValue.getColumnNameAndShardingValuesMap().get("order_id");
        Integer user_id=(Integer) complexKeysShardingValue.getColumnNameAndShardingValuesMap().get("user_id");
        Integer choosetable=(order_id+user_id)%2+1;
        String table_num=choosetable.toString();
        ArrayList<String> tablename=new ArrayList<String>();
        tablename.add(table_num);

        return tablename;



    }
}
