package com.itheima.pattern.responsibility.jdk;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 19:47
 */
public class Client {
    public static void main(String[] args) {
        Request req = null;
        Response res = null;

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new FirstFilter()).addFilter(new SecondFilter());
        filterChain.doFilter(req,res);
    }
}
