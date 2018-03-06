/**
 * JBoss, Home of Professional Open Source
 * Copyright 2016, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.developers.msa.ola;
import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OlaApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OlaApplication.class);

    @PostConstruct
    public void logSomething() {
        LOGGER.trace("doStuff needed more information - {}");
        LOGGER.debug("doStuff needed to debug - {}");
        LOGGER.info("doStuff took input - {}");
        LOGGER.warn("doStuff needed to warn - {}");
        LOGGER.error("doStuff encountered an error with value - {}");
    }
    public static void main(String[] args) {
        LOGGER.trace("ddddddddddoStuff needed more information - {}");
        LOGGER.debug("ddddddddddoStuff needed to debug - {}");
        LOGGER.info("ddddddddddoStuff took input - {}");
        LOGGER.warn("dddddddddoStuff needed to warn - {}");
        LOGGER.error("dddddddddoStuff encountered an error with value - {}");

        SpringApplication.run(OlaApplication.class, args);
    }

}
