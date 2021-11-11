import java.time.LocalDateTime;
import java.util.Objects;

//@author Daria Skliarova

public class CallLog {

    private String phoneNumber;
    private Double duration;
    private CallStatus status;
    private LocalDateTime time;


    public CallLog(String phoneNumber, Double duration, CallStatus status, LocalDateTime time) {
        this.phoneNumber = phoneNumber;
        this.duration = duration;
        this.status = status;
        this.time = time;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public CallStatus getStatus() {
        return status;
    }

    public void setStatus(CallStatus status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

}
