package priv.zhk.game.common.config;

import java.io.File;
import java.io.IOException;

abstract public class BaseConfigFile<T> extends File {

    public BaseConfigFile(String pathname) {
        super(pathname);
    }

    abstract T readConfig() throws IOException;

}
