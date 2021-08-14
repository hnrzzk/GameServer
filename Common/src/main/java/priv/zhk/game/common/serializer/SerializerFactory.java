package priv.zhk.game.common.serializer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SerializerFactory {
    private SerializerFactory(){}
    private static final SerializerFactory INSTANCE = new SerializerFactory();

    private final Map<SerializerType, JacksonSerializer> serializerInstance = new ConcurrentHashMap<>(SerializerType.values().length);

    public static JacksonSerializer getSerializer(SerializerType type) {
        if (null == type) {
            throw new NullPointerException("Get Serializer failed! reason: type is null");
        }
        return INSTANCE.serializerInstance.computeIfAbsent(type, serializerType ->  {
            switch (serializerType) {
                case XML: return new XmlSerializer();
                case JSON: return new JsonSerializer();
                default: throw new RuntimeException("Serializer not exist. Type: " + serializerType);
            }
        });
    }
}
