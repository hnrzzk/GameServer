package priv.zhk.game.common.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfigFile extends BaseConfigFile<Properties> {

    public PropertiesConfigFile(String pathname) {
        super(pathname);
    }

    @Override
    Properties readConfig() throws IOException {
        Properties result = new Properties();
        result.load(new FileInputStream(this));
        return result;
    }
}
