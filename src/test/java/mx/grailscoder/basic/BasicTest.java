package mx.grailscoder.basic;

import mx.grailscoder.beans.ChildA;
import mx.grailscoder.beans.ChildB;
import mx.grailscoder.utils.BasicUtils;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Armando Montoya, aj.montoya@outlook.com
 * created on: 2/20/18
 */
public class BasicTest {

    @Test
    public void testJsonToChildA() throws IOException {
        String message = "{\"propertyUniqueForThisClass\": \"ChildAValue\"}";
        Basic basic = BasicUtils.buildMessageFromJSON(message);
        assertNotNull(basic);
        assertTrue(basic instanceof ChildA);
        System.out.println(basic);
    }

    @Test
    public void testJsonToChildB() throws IOException {
        String message = "{\"childBUniqueProperty\": \"ChildBValue\"}";
        Basic basic = BasicUtils.buildMessageFromJSON(message);
        assertNotNull(basic);
        assertTrue(basic instanceof ChildB);
        System.out.println(basic);
    }

}
