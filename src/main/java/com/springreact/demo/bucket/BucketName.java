package com.springreact.demo.bucket;

public enum BucketName {
    PROFILE_IMAGE("vladtf-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
