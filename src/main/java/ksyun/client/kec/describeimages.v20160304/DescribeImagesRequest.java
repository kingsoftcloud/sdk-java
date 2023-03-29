package ksyun.client.kec.describeimages.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeImagesRequest
* @Description 请求参数
*/
@Data
public class DescribeImagesRequest{
    /**镜像ID。
b1e3731b-c200-4499-be42-f6bfbbda990e。*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**镜像分类。
system*/
    @KsYunField(name="ImageType")
    private String ImageType;


}