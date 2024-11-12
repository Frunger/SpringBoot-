package cn.edu.gench.javaee.fengjingxuan2220680.spring.factory;

import org.springframework.beans.factory.FactoryBean;

public class GetFieldFactoryBean implements FactoryBean<Object> {
    private String targetClass;
    private String field;

    public void setTargetClass(String targetClass) {
        this.targetClass = targetClass;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public Object getObject() throws Exception {
        Class<?> clazz = Class.forName(targetClass);
        return clazz.getField(field).get(clazz);
    }

    @Override
    public Class<?> getObjectType() {
        return Object.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
