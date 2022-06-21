package com.itheima.pattern.responsibility.jdk;

/**
 * @version v1.0
 * @ClassName: Filter
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 19:36
 */
public interface Filter {
    public void doFilter(Request request, Response response, FilterChain chain);
}
