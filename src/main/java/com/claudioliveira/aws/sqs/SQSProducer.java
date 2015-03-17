package com.claudioliveira.aws.sqs;

import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by claudio on 13/03/15.
 */
@Configuration
public class SQSProducer {

    @Autowired
    private StaticCredentialsProvider staticCredentialsProvider;
    
    @Bean(name = "sqsClient")
    public AmazonSQSClient sqsClient(){
        AmazonSQSClient sqsClient = new AmazonSQSClient(staticCredentialsProvider);
        sqsClient.setRegion(Regions.DEFAULT_REGION);
        return sqsClient;
    }
    
}
