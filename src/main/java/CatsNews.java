import com.fasterxml.jackson.annotation.JsonProperty;

public class CatsNews {
    String id;
    String text;
    String type;
    String user;
    Integer upvotes;
    public CatsNews(
        @JsonProperty("id") String id,
        @JsonProperty("text") String text,
        @JsonProperty("type") String type,
        @JsonProperty("user") String user,
        @JsonProperty("upvotes") Integer upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "CatsNews{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }
}
