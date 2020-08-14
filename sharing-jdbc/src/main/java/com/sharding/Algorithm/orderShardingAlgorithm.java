package com.sharding.Algorithm;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;
import java.util.Iterator;

@Slf4j
public class orderShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        log.info("collection:" + collection + ",shardingValues:" + preciseShardingValue);
        String databaseName=preciseShardingValue.getValue()%2+1+"";
        log.info(databaseName);
        Iterator iterator=collection.iterator();
        while (iterator.hasNext())
        {
            String realroute=(String) iterator.next();
            if(realroute.endsWith(databaseName))
            {
                log.info("mes=====>" + " " + realroute);
                return realroute;
            }

        }
//        for (String mes:collection) {
//            log.debug(preciseShardingValue.getValue()%2+1+"");
//            if((preciseShardingValue.getValue()%2+1+"").endsWith(mes)) {
//                log.info("mes=====>" + " " + mes);
//                return mes;
//            }
//        }
        return "";
    }
}
