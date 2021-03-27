package fr.esiea.ex4A;
import com.fasterxml.jackson.annotation.JsonProperty;
public class User {

    public final String userEmail;
    public final String userCountry;
    public final String userName;
    public final String userSex;
    public final String userSexPref;
    public final String userTweeter;

    public User(@JsonProperty("userEmail") String userEmail,@JsonProperty("userCountry")String userCountry,@JsonProperty("userName") String userName,
                @JsonProperty("userSex") String userSex,@JsonProperty("userSexPref") String userSexPref,@JsonProperty("userTweeter") String userTweeter){
        this.userEmail = userEmail;
        this.userCountry = userCountry;
        this.userName = userName;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
        this.userTweeter = userTweeter;
    }
}
