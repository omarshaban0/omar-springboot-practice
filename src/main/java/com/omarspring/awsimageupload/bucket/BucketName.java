package com.omarspring.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("omarscode-image-upload-1234");

    private final String bucketName;

    BucketName(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
