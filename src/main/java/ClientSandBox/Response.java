package ClientSandBox;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    @JsonProperty
    private String content;

    @JsonProperty
    private int number;

    public String getGreeting(){
        return content;
    }

    public void setGreeting(String content){
        this.content = content;
    }

    public Response(){

    }

}
