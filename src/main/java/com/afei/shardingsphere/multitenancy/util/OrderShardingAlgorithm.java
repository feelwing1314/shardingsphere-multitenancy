package com.afei.shardingsphere.multitenancy.util;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

public class OrderShardingAlgorithm implements PreciseShardingAlgorithm<String> {

    private static final String TABLE_NAME_PREFIX = "tb_order_";

    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<String> shardingValue) {
        String targetTable = TABLE_NAME_PREFIX + shardingValue.getValue();
        if (availableTargetNames.contains(targetTable)){
            return targetTable;
        }

        throw new UnsupportedOperationException("无法判定的值: " + shardingValue.getValue());
    }
}
