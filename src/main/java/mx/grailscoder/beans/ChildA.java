package mx.grailscoder.beans;

import mx.grailscoder.basic.Basic;

/**
 * @author Armando Montoya, aj.montoya@outlook.com
 * created on: 2/20/18
 */
public class ChildA implements Basic {
    private String propertyUniqueForThisClass;

    public ChildA() {
    }

    public String getPropertyUniqueForThisClass() {
        return propertyUniqueForThisClass;
    }

    public void setPropertyUniqueForThisClass(final String propertyUniqueForThisClass) {
        this.propertyUniqueForThisClass = propertyUniqueForThisClass;
    }

    @Override
    public String toString() {
        return "ChildA{" +
                "propertyUniqueForThisClass='" + propertyUniqueForThisClass + '\'' +
                '}';
    }
}
