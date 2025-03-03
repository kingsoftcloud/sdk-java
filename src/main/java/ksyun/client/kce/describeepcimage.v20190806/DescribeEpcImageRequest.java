package ksyun.client.kce.describeepcimage.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeEpcImageRequest
 * @Description 请求参数
 */
@Data
public class DescribeEpcImageRequest {
    /**
     * 镜像id
     */
    @KsYunField(name = "ImageId")
    private List<String> ImageIdList;


}