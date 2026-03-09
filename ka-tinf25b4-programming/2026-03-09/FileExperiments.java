import java.io.File;
import java.io.IOException;

void main() throws IOException {
    File dir = new File("./myDir");

    dir.mkdir();

    new File(dir, "foo1").createNewFile();
    new File(dir, "foo2").createNewFile();
    new File(dir, "foo3").createNewFile();

    for (String path : dir.list()) {
        File toDelete = new File(dir, path);
        toDelete.delete();
    }
    dir.delete();
}