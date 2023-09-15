package ksyun.client.kce.describeinstanceimage.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInstanceImageRequest
* @Description 请求参数
*/
@Data
public class DescribeInstanceImageRequest{
    /**镜像id*/
    @KsYunField(name="ImageId")
    private List<String> ImageIdList;


}