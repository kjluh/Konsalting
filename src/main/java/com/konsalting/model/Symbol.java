package com.konsalting.model;


public class Symbol {
    /**
     * Символ
     */
    private String s;
    /**
     * Количество символов
     */
    private Integer count;

    public Symbol(String s, Integer count) {
        this.s = s;
        this.count = count;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Symvol{" +
                "s='" + s + '\'' +
                ", count=" + count +
                '}';
    }
}
