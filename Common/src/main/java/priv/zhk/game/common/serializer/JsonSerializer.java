package priv.zhk.game.common.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 现场安全类
 */
public class JsonSerializer extends JacksonSerializer{
    protected JsonSerializer(){}

    @Override
    protected ObjectMapper generateObjectMapper() {
        return new ObjectMapper();
    }
}
