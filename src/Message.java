import java.time.LocalDateTime;
import java.util.Objects;

//@author Daria Skliarova

public class Message {

    private String phoneNumber;
    private String text;
    private LocalDateTime sentTime;


    public Message(String phoneNumber, String text, LocalDateTime sentTime) {
        this.phoneNumber = phoneNumber;
        this.text = text;
        this.sentTime = sentTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
    }

    public void setSentTime(LocalDateTime sentTime) {
        this.sentTime = sentTime;
    }
}
