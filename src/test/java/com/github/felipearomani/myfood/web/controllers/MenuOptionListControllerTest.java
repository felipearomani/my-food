package com.github.felipearomani.myfood.web.controllers;

import com.github.felipearomani.myfood.MyFoodApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MyFoodApplication.class })
@WebAppConfiguration
public class MenuOptionListControllerTest {

    @Autowired
    private WebApplicationContext applicationContext;
    private MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(this.applicationContext).build();
    }

    @Test
    public void givenContextThenItProvidesFoodListController() {
        ServletContext context = applicationContext.getServletContext();

        Assert.assertNotNull(context);
        Assert.assertTrue(context instanceof MockServletContext);
        Assert.assertNotNull(applicationContext.getBean("foodListController"));
    }

    @Test
    public void givenFoodsURIThenVerifyResponse() throws Exception {
        ResultActions result = mockMvc.perform(get("/foods"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.totalElements").value("4"));

    }
}