package chanedi.generator.model;

import chanedi.generator.parser.CreateTableListenerImpl;
import chanedi.generator.parser.gen.CreateTableLexer;
import chanedi.generator.parser.gen.CreateTableParser;
import chanedi.utils.FileUtils;
import lombok.Getter;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by jijy on 2014/7/24.
 */
public class Module {

    @Getter
    private String name;
    @Getter
    private List<Bean> beans;

    public Module(File sqlFile) throws IOException {
        name = FileUtils.removeFileExtension(sqlFile.getName());

        parseBean(sqlFile);
    }

    private void parseBean(File sqlFile) throws IOException {
        CharStream input = new ANTLRFileStream(sqlFile.getAbsolutePath());
        CreateTableLexer lexer = new CreateTableLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CreateTableParser parser = new CreateTableParser(tokens);
        ParseTree tree = parser.sql();

        ParseTreeWalker walker = new ParseTreeWalker();
        CreateTableListenerImpl extractor = new CreateTableListenerImpl();
        walker.walk(extractor, tree);
        beans = extractor.getTables();
    }

}
