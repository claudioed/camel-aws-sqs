package com.claudioliveira.aws.sqs;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSCredentialsProvider {

    @Bean
    public StaticCredentialsProvider staticCredentialsProvider(){
        return new StaticCredentialsProvider(new BasicAWSCredentials(System.getProperty("AWS_ACCESS_KEY_ID","ACCESS KEY"),System.getProperty("AWS_SECRET_KEY","SECRET KEY")));
    }
    
}