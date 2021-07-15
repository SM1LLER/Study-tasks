package by.training.task04.service.impl;

import by.training.task04.service.RequestParser;

public class RequestParserImpl implements RequestParser {
    private final String PARAM_DELIMETER = "\\s";
    private String lastRequest = null;
    private String fileName = null;
    private int numOfClients = 0;
    private int clientId = 0;

    @Override
    public String getFileName(String request) {
        parseFile(request);
        return this.fileName;
    }

    @Override
    public int getNumOfClients(String request) {
        parseFile(request);
        return this.numOfClients;
    }

    @Override
    public int getClientId(String request) {
        if (request.equals(this.lastRequest)){
            return clientId;
        }
        this.lastRequest = request;
        String[] params = request.split(PARAM_DELIMETER);
        this.clientId = Integer.parseInt(params[1]);
        return clientId;
    }

    private void parseFile(String request){
        if (request.equals(this.lastRequest)){
            return;
        }

        String[] params = request.split(PARAM_DELIMETER);
        this.fileName = params[1];
        if (params.length > 2){
            this.numOfClients = Integer.parseInt(params[2]);
        }
        this.lastRequest = request;
    }
}
