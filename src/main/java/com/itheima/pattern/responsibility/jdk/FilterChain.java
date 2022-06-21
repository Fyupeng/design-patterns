package com.itheima.pattern.responsibility.jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ClassName: FilterChain
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 16日 19:41
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    private int index = 0;

    public FilterChain addFilter(Filter filter){
        this.filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response){
        if(index == filters.size()){
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }

}
