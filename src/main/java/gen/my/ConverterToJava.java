package gen.my;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ConverterToJava {

    private List<String> myCode = new ArrayList<>();

    public void convertToJava(List<String> myCode, Path path ) {
        this.myCode.add("package Files;");
        this.myCode.add("public class Test {");
        this.myCode.addAll(myCode);
        this.myCode.add("}");


        try {
            Files.createFile(path);
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            Files.write(path, this.myCode, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
