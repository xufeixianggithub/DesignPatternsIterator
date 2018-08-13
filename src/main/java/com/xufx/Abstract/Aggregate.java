package com.xufx.Abstract;


import com.xufx.Interfaces.AggregationIterator;

/**
 * 聚合对象的接口，定义创建相应迭代器对象的接口
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代器对象的接口
     * @return 相应迭代器对象的接口
     */
    public abstract AggregationIterator createIterator();
}