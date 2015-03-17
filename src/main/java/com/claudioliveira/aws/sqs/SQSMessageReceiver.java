package com.claudioliveira.aws.sqs;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.aws.s3.S3Constants;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by claudio on 10/03/15.
 */
@Component
public class SQSMessageReceiver extends SpringRouteBuilder {

    private static final String SQS_ROUTE_CONFIGURATION = "aws-sqs://turismo-contabilizacao-acesso-prod?amazonSQSClient=#sqsClient&amazonSQSEndpoint=sqs.us-east-1.amazonaws.com&delay=5000&maxMessagesPerPoll=1";

    @Override
    public void configure() throws Exception {
        from(SQS_ROUTE_CONFIGURATION).routeId("sqsMessageReceiver")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        //Processe sua mensagem
                    }
                }).log("Mensagem processada com sucesso!!");
    }
    
}
