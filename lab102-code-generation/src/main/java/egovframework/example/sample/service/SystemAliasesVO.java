package egovframework.example.sample.service;

/**
 * @Class Name : SystemAliasesVO.java
 * @Description : SystemAliases VO class
 * @Modification Information
 *
 * @author com
 * @since 0701
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */
public class SystemAliasesVO extends SystemAliasesDefaultVO{
    private static final long serialVersionUID = 1L;
    
    /** OBJECT_TYPE */
    private java.lang.String objectType;
    
    /** OBJECT_CAT */
    private java.lang.String objectCat;
    
    /** OBJECT_SCHEM */
    private java.lang.String objectSchem;
    
    /** OBJECT_NAME */
    private java.lang.String objectName;
    
    /** ALIAS_CAT */
    private java.lang.String aliasCat;
    
    /** ALIAS_SCHEM */
    private java.lang.String aliasSchem;
    
    /** ALIAS */
    private java.lang.String alias;
    
    public java.lang.String getObjectType() {
        return this.objectType;
    }
    
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }
    
    public java.lang.String getObjectCat() {
        return this.objectCat;
    }
    
    public void setObjectCat(java.lang.String objectCat) {
        this.objectCat = objectCat;
    }
    
    public java.lang.String getObjectSchem() {
        return this.objectSchem;
    }
    
    public void setObjectSchem(java.lang.String objectSchem) {
        this.objectSchem = objectSchem;
    }
    
    public java.lang.String getObjectName() {
        return this.objectName;
    }
    
    public void setObjectName(java.lang.String objectName) {
        this.objectName = objectName;
    }
    
    public java.lang.String getAliasCat() {
        return this.aliasCat;
    }
    
    public void setAliasCat(java.lang.String aliasCat) {
        this.aliasCat = aliasCat;
    }
    
    public java.lang.String getAliasSchem() {
        return this.aliasSchem;
    }
    
    public void setAliasSchem(java.lang.String aliasSchem) {
        this.aliasSchem = aliasSchem;
    }
    
    public java.lang.String getAlias() {
        return this.alias;
    }
    
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }
    
}
