package priv.zhk.game.common.file;

public class PathUtils {
    public static String projectRootPath = System.getProperty("user.dir");
    static {
        projectRootPath = projectRootPath.replace("\\", "/");
    }
}
