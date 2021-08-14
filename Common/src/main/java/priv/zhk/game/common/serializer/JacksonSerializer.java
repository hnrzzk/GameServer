package priv.zhk.game.common.serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JacksonSerializer {
    private final ObjectMapper mapper = generateObjectMapper();
    protected abstract ObjectMapper generateObjectMapper();

    public  <T> T transferToBean(File file, Class<T> c) throws IOException {
        return mapper.readValue(file, c);
    }

    public <T> T transferToBean(String jsonStr, Class<T> c) throws IOException{
        return mapper.readValue(jsonStr, c);
    }


    public <T> ArrayList<T> transferToArray(String jsonStr) throws IOException {
        return mapper.readValue(jsonStr, new TypeReference<ArrayList<T>>(){});
    }

    public <K, V> HashMap<K, V> transferToMap(String jsonStr) throws IOException{
        return mapper.readValue(jsonStr, new TypeReference<HashMap<K, V>>(){});
    }

    public String transferToStr(Object obj) throws JsonProcessingException {
        return mapper.writeValueAsString(obj);
    }

    public byte[] transferToByte(Object obj) throws JsonProcessingException {
        return mapper.writeValueAsBytes(obj);
    }
}
