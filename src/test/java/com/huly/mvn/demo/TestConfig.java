package com.huly.mvn.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class TestConfig {
	String var = "hi";
	
	@Value("${prop.one:prop_def}")
    private String propertyOne;
	
}
