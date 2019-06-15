package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> menuList = new ArrayList<>();

    public void setMenuList(List<String> menuList) {
        this.menuList = menuList;
    }

    public void addMenuList(String menuName) {
        this.menuList.add(menuName);
    }

    public List<String> showMenu() {
        return this.menuList;
    }


}
