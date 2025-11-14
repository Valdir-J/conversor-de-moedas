package com.conversor.model;

import com.google.gson.annotations.SerializedName;

public record TaxaDeCambioDTO(String result, @SerializedName("conversion_rate")
double taxaDeConversao) {}
