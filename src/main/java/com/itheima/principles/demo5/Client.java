package com.itheima.principles.demo5;

public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();

        Star star = new Star("林青霞");
        agent.setStar(star);

        Fans fans = new Fans("李四");
        agent.setFans(fans);

        Company company = new Company("传媒公司");
        agent.setCompany(company);

        agent.meeting();
        agent.business();
    }
}
