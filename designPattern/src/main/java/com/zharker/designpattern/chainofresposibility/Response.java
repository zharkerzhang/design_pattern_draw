package com.zharker.designpattern.chainofresposibility;

public class Response {
    private String responseName;

    public Response(String responseName) {
        this.responseName = responseName;
    }

    @Override
    public String toString() {
        return "Response{" +
                "responseName='" + responseName + '\'' +
                '}';
    }
}
