package mx.grailscoder.beans;

import mx.grailscoder.basic.Basic;

/**
 * @author Armando Montoya, aj.montoya@outlook.com
 * created on: 2/20/18
 */
public class ChildB implements Basic {
    private String childBUniqueProperty;

    public ChildB() {
    }

    public String getChildBUniqueProperty() {
        return childBUniqueProperty;
    }

    public void setChildBUniqueProperty(final String childBUniqueProperty) {
        this.childBUniqueProperty = childBUniqueProperty;
    }

    @Override
    public String toString() {
        return "ChildB{" +
                "childBUniqueProperty='" + childBUniqueProperty + '\'' +
                '}';
    }
}
