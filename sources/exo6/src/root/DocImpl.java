package root;

public class DocImpl implements Doc {
    String content;

    public DocImpl(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
