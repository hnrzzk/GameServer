package priv.zhk.game.common.config;

import priv.zhk.game.common.serializer.JacksonSerializer;
import priv.zhk.game.common.serializer.SerializerFactory;
import priv.zhk.game.common.serializer.SerializerType;

import java.io.IOException;

public class XmlConfigFile<T> extends BaseConfigFile<T> {
    private final JacksonSerializer serializer = SerializerFactory.getSerializer(SerializerType.XML);
    private final Class<T> c;
    public XmlConfigFile(String pathname, Class<T> c) {
        super(pathname);
        this.c = c;
    }

    @Override
    T readConfig() throws IOException {
        return serializer.transferToBean(this, c);
    }
}
