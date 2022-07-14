
package com.movsisyan.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Date",
    "Codeshare",
    "Arrival",
    "Flight",
    "Departure"
})
@Generated("jsonschema2pojo")
public class RegisteredFlight {

    @JsonProperty(shape = )
    private Date date;
    @JsonProperty("Codeshare")
    private boolean codeshare;
    @JsonProperty("Arrival")
    private Arrival arrival;
    @JsonProperty("Flight")
    private String flight;
    @JsonProperty("Departure")
    private Departure departure;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RegisteredFlight() {
    }

    /**
     * 
     * @param date
     * @param flight
     * @param codeshare
     * @param arrival
     * @param departure
     */
    public RegisteredFlight(Date date, boolean codeshare, Arrival arrival, String flight, Departure departure) {
        super();
        this.date = date;
        this.codeshare = codeshare;
        this.arrival = arrival;
        this.flight = flight;
        this.departure = departure;
    }

    @JsonProperty("Date")
    public Date getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(Date date) {
        this.date = date;
    }

    @JsonProperty("Codeshare")
    public boolean isCodeshare() {
        return codeshare;
    }

    @JsonProperty("Codeshare")
    public void setCodeshare(boolean codeshare) {
        this.codeshare = codeshare;
    }

    @JsonProperty("Arrival")
    public Arrival getArrival() {
        return arrival;
    }

    @JsonProperty("Arrival")
    public void setArrival(Arrival arrival) {
        this.arrival = arrival;
    }

    @JsonProperty("Flight")
    public String getFlight() {
        return flight;
    }

    @JsonProperty("Flight")
    public void setFlight(String flight) {
        this.flight = flight;
    }

    @JsonProperty("Departure")
    public Departure getDeparture() {
        return departure;
    }

    @JsonProperty("Departure")
    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "RegisteredFlight{" +
                "date='" + date + '\'' +
                ", codeshare=" + codeshare +
                ", arrival=" + arrival +
                ", flight='" + flight + '\'' +
                ", departure=" + departure +
                '}';
    }
}
