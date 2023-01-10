package online.weiyin.dao.impl;

import online.weiyin.dao.ListDao;

import java.util.*;

public class ListDaoImpl implements ListDao {
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<Integer,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ListDaoImpl{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
