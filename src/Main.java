import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

//@author Daria Skliarova

public class Main {

    public static void main(String[] args){
        new Main().exe();
    }
    private void exe(){

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Mother", "0970000000"));
        contacts.add(new Contact("Father", "0670000000"));
        contacts.add(new Contact("Yurii", "0505858548"));
        contacts.add(new Contact("Chef", "0957726298"));
        contacts.add(new Contact("Olena", "0663210000"));

        List<CallLog> calls = new ArrayList<>();
        calls.add(new CallLog("0970000000", 02.23, CallStatus.RECEIVED, LocalDateTime.now()));
        calls.add(new CallLog("06632100000", 00.01, CallStatus.REJECTED, LocalDateTime.now()));
        calls.add(new CallLog("0442383829", 00.00, CallStatus.MISSED, LocalDateTime.now()));
        calls.add(new CallLog("0505858548", 05.44, CallStatus.RECEIVED, LocalDateTime.now()));
        calls.add(new CallLog("0933448979", 00.15, CallStatus.RECEIVED, LocalDateTime.now()));

        List<Message> massages = new ArrayList<>();
        massages.add(new Message("0970000000", "I was trying to call you", LocalDateTime.now()));
        massages.add(new Message("0505858548", "Where are you?", LocalDateTime.now()));
        massages.add(new Message("0440101000", "*Advertisment*", LocalDateTime.now()));
        massages.add(new Message("06632100000", "Call me back.", LocalDateTime.now()));

    }

    public static Collection<Contact> findContact(String text, Collection<Contact> contacts){
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase(Locale.ROOT).contains(text.toLowerCase(Locale.ROOT))){
                result.add(contact);
            }
        }
        return result;
    }

    public static Collection<Message> findMassage(String text, Collection<Message> massages){
        List<Message> result = new ArrayList<>();
        for (Message massage : massages) {
            if (massage.getPhoneNumber().contains(text.trim())){
                result.add(massage);
            }
        }
        return result;
    }

    public static Collection<CallLog> findCall(String text, Collection<CallLog> calls){
        List<CallLog> result = new ArrayList<>();
        for (CallLog call : calls) {
            if (call.getPhoneNumber().contains(text.trim())){
                result.add(call);
            }
        }
        return result;
    }
}
