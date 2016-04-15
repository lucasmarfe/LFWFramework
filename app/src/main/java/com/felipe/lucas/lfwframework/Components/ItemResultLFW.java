package com.felipe.lucas.lfwframework.Components;

/**
 * Created by lucas on 11/02/2016.
 */
public class ItemResultLFW {
    private String m_ItemMenuIdentify;
    private String m_ItemMenuInfo1;
    private String m_ItemMenuInfo2;
    private Integer m_ItemStatusColor;
    private Class m_ItemMenuClass;

    public ItemResultLFW (String p_ItemMenuIdentify, String p_ItemMenuInfo1, String
            p_ItemMenuInfo2, Integer p_ItemStatusColor, Class p_ItemMenuClass) {
        this.m_ItemMenuIdentify = p_ItemMenuIdentify;
        this.m_ItemMenuInfo1 = p_ItemMenuInfo1;
        this.m_ItemMenuInfo2 = p_ItemMenuInfo2;
        this.m_ItemStatusColor = p_ItemStatusColor;
        this.m_ItemMenuClass = p_ItemMenuClass;
    }

    public String getItemMenuIdentify () {
        return m_ItemMenuIdentify;
    }

    public void setItemMenuIdentify (String m_ItemMenuIdentify) {
        this.m_ItemMenuIdentify = m_ItemMenuIdentify;
    }

    public String getItemMenuInfo1 () {
        return m_ItemMenuInfo1;
    }

    public void setItemMenuInfo1 (String m_ItemMenuInfo1) {
        this.m_ItemMenuInfo1 = m_ItemMenuInfo1;
    }

    public String getItemMenuInfo2 () {
        return m_ItemMenuInfo2;
    }

    public void setItemMenuInfo2 (String m_ItemMenuInfo2) {
        this.m_ItemMenuInfo2 = m_ItemMenuInfo2;
    }

    public Integer getItemStatusColor () {
        return m_ItemStatusColor;
    }

    public void setItemStatusColor (int m_ItemStatus) {
        this.m_ItemStatusColor = m_ItemStatus;
    }

    public Class getItemMenuClass () {
        return m_ItemMenuClass;
    }

    public void setItemMenuClass (Class m_ItemMenuClass) {
        this.m_ItemMenuClass = m_ItemMenuClass;
    }
}
