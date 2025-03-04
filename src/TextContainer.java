
@SaveTo(param = "file.txt")
public class TextContainer {
    String text = "Annotations do not directly affect " +
            "program semantics, but they do affect " +
            "the way programs are treated by tools " +
            "and libraries, which can in turn affect " +
            "the semantics of the running program. " +
            "Annotations can be read from source files, " +
            "class files, or reflectively at run time.";

    @Saver
    public void save(String filePath) {
        try (java.io.FileWriter writer = new java.io.FileWriter(filePath)) {
            writer.write(text);
            System.out.println("The text has been saved! " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
