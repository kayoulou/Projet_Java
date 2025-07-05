package com.ums.factory;

public class ConcreteFactory {
    @SuppressWarnings("unchecked")
    public static <T extends IDaoFactory> T getFactory(Class<T> factoryClass) {
        if (factoryClass.equals(HibernateDaoFactory.class)) {
            return (T) HibernateDaoFactory.getInstance();
        }
        throw new IllegalArgumentException("Unknown factory class: " + factoryClass.getName());
    }
}
