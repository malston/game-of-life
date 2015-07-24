package com.wakaleo.gameoflife;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class SimpleTest {
    @Value("#{systemProperties['rest.url']}")
    String url;
    
    @Test
    public void TheHomePageShouldReturn200(){
        RestTemplate template = new RestTemplate();
        //url= "http://game-war.cfapps.io/home";
        ResponseEntity<String>  response = template.getForEntity(url, String.class);
        Assert.assertEquals(200, response.getStatusCode().value());
    }
}
