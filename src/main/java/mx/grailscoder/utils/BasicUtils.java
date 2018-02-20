package mx.grailscoder.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import mx.grailscoder.basic.Basic;
import mx.grailscoder.deserializer.BasicDeserializer;

import java.io.IOException;

/**
 * @author Armando Montoya, aj.montoya@outlook.com
 * created on: 2/20/18
 */
public final class BasicUtils {

    private static final ObjectMapper MAPPER;

    // following good software practices, utils can not have constructors
    private BasicUtils() {}

    static {
        final SimpleModule module = new SimpleModule();
        MAPPER = new ObjectMapper();
        module.addDeserializer(Basic.class, new BasicDeserializer());
        MAPPER.registerModule(module);
    }

    public static String buildJSONFromMessage(final Basic message)
            throws JsonProcessingException {
        return MAPPER.writeValueAsString(message);
    }

    public static Basic buildMessageFromJSON(final String jsonMessage)
            throws IOException {
        return MAPPER.readValue(jsonMessage, Basic.class);
    }

}
