package com.springreact.demo.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    private final AWSConfig awsConfig;

    public AmazonConfig(AWSConfig awsConfig) {
        this.awsConfig = awsConfig;
    }

    public AmazonS3 s3(){
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                awsConfig.getAccessKeyId(),
                awsConfig.getSecretKey()
        );

        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
