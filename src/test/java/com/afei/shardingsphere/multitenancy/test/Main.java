package com.afei.shardingsphere.multitenancy.test;

import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < 20; i++) {

            List<String> merchantList = Lists.newArrayList("aliyun", "taobao", "tmall");
            int index = new Random().nextInt(merchantList.size());
            System.out.println("index = " + index);
            result.add(index);
        }
        System.out.println(result);
    }

}
