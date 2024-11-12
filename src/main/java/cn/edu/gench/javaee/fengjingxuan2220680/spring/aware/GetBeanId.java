package cn.edu.gench.javaee.fengjingxuan2220680.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

public class GetBeanId implements BeanNameAware {
    private String beanId;

    @Override
    public void setBeanName(String name) {
        this.beanId = name;
        System.out.println("==== Bean Name Aware ====");
    }

    public String getBeanId() {
        return beanId;
    }
}
