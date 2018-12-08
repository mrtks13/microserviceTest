package com.fama.core.cucumber.stepdefs;

import com.fama.core.MicroserviceTestApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MicroserviceTestApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
