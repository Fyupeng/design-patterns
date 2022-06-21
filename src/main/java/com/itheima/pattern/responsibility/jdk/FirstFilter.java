package com.itheima.pattern.responsibility.jdk;

/**
 * @version v1.0
 * @ClassName: FirstFilter
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 19:37
 */
public class FirstFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("过滤器1 前置处理");

        chain.doFilter(request, response);

        System.out.println("过滤器1 后置处理");

    }
}
