package com.zharker.designpattern.chainofresposibility;

public abstract class Handler {
    private Handler nextHandler;
    
    public final Response handleMessage(Request request){
        Response response = null;
        if(this.getHandlerLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        }else{
            if(this.nextHandler != null){
                response = this.nextHandler.handleMessage(request);
            }
        }
        return response;
        
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract Response echo(Request request);

    protected abstract Level getHandlerLevel();
}
