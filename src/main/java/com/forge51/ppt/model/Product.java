package com.forge51.ppt.model;

public record Product( String productId, String name, long stockLanded, long stockInStore, IndustryClassification industryClassification )

{
}
