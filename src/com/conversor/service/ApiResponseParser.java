package com.conversor.service;

import com.conversor.model.TaxaDeCambioDTO;
import com.google.gson.Gson;

public class ApiResponseParser {

    public TaxaDeCambioDTO parse(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, TaxaDeCambioDTO.class);
    }
}
