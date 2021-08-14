package priv.zhk.game.common.exception;

public class FileNotExistException extends Exception{
    public FileNotExistException(String path) {
        super("file path: " + path);
    }
}
