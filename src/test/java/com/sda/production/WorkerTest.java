package com.sda.production;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/test-application-content.xml")
public class WorkerTest {

    @Autowired
    private Worker worker;

    @Test
    public void getTest(){
        Assert.assertNotNull(worker);
        Assert.assertNotNull(worker.getTools());
        Assert.assertEquals(3,3);
        // Assert.assertEquals("surubelnita");

    }
}