package priv.zhk.game.common.serializer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class XmlSerializer extends JacksonSerializer{
    protected XmlSerializer(){}

    @Override
    protected ObjectMapper generateObjectMapper() {
        return new XmlMapper();
    }
}
