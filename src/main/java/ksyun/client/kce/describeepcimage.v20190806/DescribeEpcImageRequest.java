package ksyun.client.kce.describeepcimage.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeEpcImageRequest
* @Description 请求参数
*/
@Data
public class DescribeEpcImageRequest{
    /**镜像id*/
    @KsYunField(name="ImageId")
    private List<String> ImageIdList;


}