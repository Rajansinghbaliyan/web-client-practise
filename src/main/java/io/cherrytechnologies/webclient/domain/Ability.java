package io.cherrytechnologies.webclient.domain;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Ability {
    public Ability ability;
    public boolean is_hidden;
    public int slot;
}
