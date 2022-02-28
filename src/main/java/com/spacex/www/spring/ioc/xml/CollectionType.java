package com.spacex.www.spring.ioc.xml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author :sbx
 * @date :2022/2/17 15:39
 * @description :
 * @version: :1.0.0
 */
public class CollectionType {
    private String[] arrray;
    private List<String> list;
    private Map<String, String> map;
    private Set<String> set;
    private List<Book> book;

    public Map<String, String> getMap2() {
        return map2;
    }

    public void setMap2(Map<String, String> map2) {
        this.map2 = map2;
    }

    private Map<String, String> map2;

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public String[] getArrray() {
        return arrray;
    }

    public void setArrray(String[] arrray) {
        this.arrray = arrray;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "CollectionType{" +
                "arrray=" + Arrays.toString(arrray) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", book=" + book +
                ", map2=" + map2 +
                '}';
    }
}