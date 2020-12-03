package com.design.patterns.converter;

abstract class Converter <T, U> {
     /**
     * T -> U
     */
    abstract U from(final T dto);
    
    /*
     * U -> T
     */
    abstract T to(final U entity);
}
