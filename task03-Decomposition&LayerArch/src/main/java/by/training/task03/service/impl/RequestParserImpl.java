package by.training.task03.service.impl;

import by.training.task03.service.RequestParser;

public class RequestParserImpl implements RequestParser {
    private final String PARAM_DELIMETER = "\\s";
    private String lastRequest = null;
    private String fileName = null;
    private boolean isIncreasing = false;

    @Override
    public String getFileName(String request) {
        parse(request);
        return this.fileName;
    }

    @Override
    public boolean getIsIncreasing(String request) {
        parse(request);
        return this.isIncreasing;
    }

    private void parse(String request){
        if (request.equals(this.lastRequest)){
            return;
        }

        String[] params = request.split(PARAM_DELIMETER);
        this.fileName = params[1];
        if (params.length > 2){
            this.isIncreasing = Boolean.parseBoolean(params[2]);
        }
        this.lastRequest = request;
    }
}
