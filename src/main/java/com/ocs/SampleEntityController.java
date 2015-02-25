package com.ocs;

import com.ocs.entity.SampleEntity;
import com.ocs.spring.service.SampleEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Goodarzi on 02/16/2015.
 */
@RestController
@RequestMapping("/mySample")
public class SampleEntityController {

    @Autowired
    SampleEntityService sampleEntityService;

    @RequestMapping("/testSampleEntity")
    public void saveSampleEntirty(@RequestParam(value = "description", required = true) String description) {

        System.out.println("Started from here..");
        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setDescription("ssss");

        sampleEntityService = new SampleEntityService();
        sampleEntityService.addSampleEntity(sampleEntity);
        System.out.println("Ends here..");

        //todo: create ISampleEntityService and SampleEntityService in component package
    }
}
