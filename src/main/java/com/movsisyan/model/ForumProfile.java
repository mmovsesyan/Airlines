
package com.movsisyan.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Registered Flights",
    "NickName",
    "Travel Documents",
    "Sex",
    "Loyality Programm",
    "Real Name"
})
@Generated("jsonschema2pojo")
public class ForumProfile {

    @JsonProperty("Registered Flights")
    private List<RegisteredFlight> registeredFlights = null;
    @JsonProperty("NickName")
    private String nickName;
    @JsonProperty("Travel Documents")
    private List<TravelDocument> travelDocuments = null;
    @JsonProperty("Sex")
    private String sex;
    @JsonProperty("Loyality Programm")
    private List<Object> loyalityProgramm = null;
    @JsonProperty("Real Name")
    private RealName realName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForumProfile() {
    }

    /**
     * 
     * @param realName
     * @param loyalityProgramm
     * @param travelDocuments
     * @param registeredFlights
     * @param nickName
     * @param sex
     */
    public ForumProfile(List<RegisteredFlight> registeredFlights, String nickName, List<TravelDocument> travelDocuments, String sex, List<Object> loyalityProgramm, RealName realName) {
        super();
        this.registeredFlights = registeredFlights;
        this.nickName = nickName;
        this.travelDocuments = travelDocuments;
        this.sex = sex;
        this.loyalityProgramm = loyalityProgramm;
        this.realName = realName;
    }

    @JsonProperty("Registered Flights")
    public List<RegisteredFlight> getRegisteredFlights() {
        return registeredFlights;
    }

    @JsonProperty("Registered Flights")
    public void setRegisteredFlights(List<RegisteredFlight> registeredFlights) {
        this.registeredFlights = registeredFlights;
    }

    @JsonProperty("NickName")
    public String getNickName() {
        return nickName;
    }

    @JsonProperty("NickName")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @JsonProperty("Travel Documents")
    public List<TravelDocument> getTravelDocuments() {
        return travelDocuments;
    }

    @JsonProperty("Travel Documents")
    public void setTravelDocuments(List<TravelDocument> travelDocuments) {
        this.travelDocuments = travelDocuments;
    }

    @JsonProperty("Sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("Sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("Loyality Programm")
    public List<Object> getLoyalityProgramm() {
        return loyalityProgramm;
    }

    @JsonProperty("Loyality Programm")
    public void setLoyalityProgramm(List<Object> loyalityProgramm) {
        this.loyalityProgramm = loyalityProgramm;
    }

    @JsonProperty("Real Name")
    public RealName getRealName() {
        return realName;
    }

    @JsonProperty("Real Name")
    public void setRealName(RealName realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "ForumProfile{" +
                "registeredFlights=" + registeredFlights +
                ", nickName='" + nickName + '\'' +
                ", travelDocuments=" + travelDocuments +
                ", sex='" + sex + '\'' +
                ", loyalityProgramm=" + loyalityProgramm +
                ", realName=" + realName +
                '}';
    }
}
