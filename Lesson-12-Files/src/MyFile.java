public class MyFile implements Comparable<MyFile>{
    private String name;
    private boolean isDirectory;

    public MyFile(String name, boolean isDirectory) {
        this.name = name;
        this.isDirectory = isDirectory;
    }

    public String getName() {
        return name;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    @Override
    public String toString()
    {
        return String.format("%s :: %s", isDirectory ? "D" : "F", name);
    }

    @Override
    public int compareTo(MyFile o) {
        if (o.isDirectory == isDirectory) {
            return name.compareTo(o.getName());
        } else {
            return isDirectory ? -1 : 1;
        }
    }
}
