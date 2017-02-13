package com.jolky.xingshop.bean;

/**
 * Tab实例
 * Created by Administrator on 2017/1/18.
 */

public class Tab {
    //标题
    private int titel;
    //背景
    private int icon;
    //fragement
    private Class fragment;
    //构造方法
    public Tab(int titel, int icon, Class fragment) {
        this.titel = titel;
        this.icon = icon;
        this.fragment = fragment;
    }
    //get与set方法
    public int getTitel() {
        return titel;
    }

    public void setTitel(int titel) {
        this.titel = titel;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public Class getFragment() {
        return fragment;
    }

    public void setFragment(Class fragment) {
        this.fragment = fragment;
    }
}
