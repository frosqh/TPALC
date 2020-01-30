package root;

public class DocImpl implements Doc {
    String content;

    public DocImpl(){
        this("Lorem Ipsum");
    }

    public DocImpl(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
