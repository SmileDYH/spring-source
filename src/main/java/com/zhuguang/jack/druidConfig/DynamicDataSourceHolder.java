package com.zhuguang.jack.druidConfig;

/*
* ThreadLocal就维护了跟当前请求线程绑定的数据源对象的字符串
* ds1 -- ds1的数据源
* ds2 -- ds2的数据源
* */
public class DynamicDataSourceHolder {

    private static ThreadLocal<String> local = new ThreadLocal<>();

    public static String getDs() {
        return local.get();
    }

    public static ThreadLocal getLocal() {
        return local;
    }
}
