package pojo;

import java.util.List;

public class TestEntity {
    private String name;
    private String id;
    private Content content;
    private List list;

    public TestEntity() {
    }

    public TestEntity(String name, String id, Content content, List list) {
        this.name = name;
        this.id = id;
        this.content = content;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public static class Content {
        private String cId;
        private String text;

        public Content() {
        }

        public Content(String cId, String text) {
            this.cId = cId;
            this.text = text;
        }

        public String getcId() {
            return cId;
        }

        public void setcId(String cId) {
            this.cId = cId;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
