package mx.grailscoder.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import mx.grailscoder.basic.Basic;
import mx.grailscoder.beans.ChildA;
import mx.grailscoder.beans.ChildB;

import java.io.IOException;

/**
 * @author Armando Montoya, aj.montoya@outlook.com
 * created on: 2/20/18
 */
public class BasicDeserializer extends StdDeserializer<Basic> {


    public BasicDeserializer() {
        this(null);
    }

    public BasicDeserializer(final Class<?> vc) {
        super(vc);
    }

    @Override
    public Basic deserialize(final JsonParser jsonParser,
                               final DeserializationContext deserializationContext)
            throws IOException {

        final JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        final ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();

        // look for propertyUniqueForThisClass property to ensure the message is of type ChildA
        if (node.has("propertyUniqueForThisClass")) {
            return mapper.treeToValue(node, ChildA.class);
            // look for childBUniqueProperty property to ensure the message is of type ChildB
        } else if (node.has("childBUniqueProperty")) {
            return mapper.treeToValue(node, ChildB.class);
        } else {
            throw new UnsupportedOperationException(
                    "Not supported class type for Message implementation");
        }
    }
}
