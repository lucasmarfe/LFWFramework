package com.felipe.lucas.lfwframework.Components;

/**
 * Created by lucas on 11/02/2016.
 */
public class ItemMenuLFW {
    private String m_ItemMenuName;
    private Class m_ItemMenuClass;

    public ItemMenuLFW (String m_ItemMenuName, Class m_ItemMenuClass) {
        this.m_ItemMenuName = m_ItemMenuName;
        this.m_ItemMenuClass = m_ItemMenuClass;
    }

    public String getItemMenuName () {
        return m_ItemMenuName;
    }

    public void setItemMenuName (String m_ItemMenuName) {
        this.m_ItemMenuName = m_ItemMenuName;
    }

    public Class getItemMenuClass () {
        return m_ItemMenuClass;
    }

    public void setItemMenuClass (Class m_ItemMenuClass) {
        this.m_ItemMenuClass = m_ItemMenuClass;
    }
}
