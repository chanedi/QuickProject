package chanedi.generator.model;

import chanedi.generator.Config;
import lombok.Getter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jijy on 2014/7/24.
 */
public class TemplateRoot {

    @Getter
    private Config config;
    @Getter
    private List<String> templateNames;

    public TemplateRoot(File rootDir) throws IOException {
        config = Config.getInstance(rootDir.getAbsolutePath());
        templateNames = new ArrayList<String>();

        parseTemplateNames(rootDir, rootDir.getName());
        preprocess();
    }

    private void parseTemplateNames(File dir, String namePath) {
        File[] files = dir.listFiles();
        for (File file : files) {
            String name = namePath + "/" + file.getName();
            if (file.isDirectory()) {
                parseTemplateNames(file, name);
            } else if (!file.getName().equals(Config.CONFIG_FILE_NAME)) {
                templateNames.add(name);
            }
        }
    }

    private void preprocess() {
        String rootPath = config.getRootPath();
        File rootPathDir = new File(rootPath);
        if (!rootPathDir.exists()) {
            rootPathDir.mkdir();
        }
    }

}
