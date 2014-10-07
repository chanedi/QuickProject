package chanedi.generator.model;

import chanedi.generator.GlobalConfig;
import chanedi.generator.sqlparser.CreateTableListenerImpl;
import chanedi.generator.sqlparser.gen.CreateTableLexer;
import chanedi.generator.sqlparser.gen.CreateTableParser;
import chanedi.util.FileUtils;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * @author Chanedi
 */
public class Module {

    @Getter
    private String name;
    /**
     * name的大写形式
     */
    @Setter
    private String capName;
    @Getter
    private Collection<Bean> beans;

    public Module(File sqlFile, GlobalConfig globalConfig) throws IOException {
        name = FileUtils.removeFileExtension(sqlFile.getName());

        parseBean(sqlFile, globalConfig);
    }

    private void parseBean(File sqlFile, GlobalConfig globalConfig) throws IOException {
        CharStream input = new ANTLRFileStream(sqlFile.getAbsolutePath());
        CreateTableLexer lexer = new CreateTableLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CreateTableParser parser = new CreateTableParser(tokens);
        ParseTree tree = parser.sql();

        ParseTreeWalker walker = new ParseTreeWalker();
        CreateTableListenerImpl extractor = new CreateTableListenerImpl(globalConfig);
        walker.walk(extractor, tree);
        beans = extractor.getTables();
    }

}
