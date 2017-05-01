package Request;

import PersonalData.PersonalData;

/**
 * Created by Tarasevich Vladislav on 26.04.2017.
 * @author ReemBer
 * This class is used to send a request to the server.
 * Each fields of this class can only be initialized (no edit)
 */
public class Request
{
    private final RequestType type;

    private final String  userName;
    private final String  password;

    private final PersonalData  first;
    private final PersonalData second;

    private final byte accessMask;

    public Request(RequestType type, String userName, String password, PersonalData first, PersonalData second, byte accessMask)
    {
        this.type = type;
        this.userName = userName;
        this.password = password;
        this.first = first;
        this.second = second;
        this.accessMask = accessMask;
    }

    public RequestType getType() {
        return type;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public PersonalData getFirst() {
        return first;
    }

    public PersonalData getSecond() {
        return second;
    }

    public byte getAccessMask() {
        return accessMask;
    }
}