
package com.movsisyan.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Forum Profiles"
})
@Generated("jsonschema2pojo")
public class Profiles {

    @JsonProperty("Forum Profiles")
    private List<ForumProfile> forumProfiles = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Profiles() {
    }

    /**
     * 
     * @param forumProfiles
     */
    public Profiles(List<ForumProfile> forumProfiles) {
        super();
        this.forumProfiles = forumProfiles;
    }

    @JsonProperty("Forum Profiles")
    public List<ForumProfile> getForumProfiles() {
        return forumProfiles;
    }

    @JsonProperty("Forum Profiles")
    public void setForumProfiles(List<ForumProfile> forumProfiles) {
        this.forumProfiles = forumProfiles;
    }

    @Override
    public String toString() {
        return "Profiles{" +
                "forumProfiles=" + forumProfiles +
                '}';
    }
}
