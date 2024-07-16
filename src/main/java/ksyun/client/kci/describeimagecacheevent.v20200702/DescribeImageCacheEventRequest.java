package ksyun.client.kci.describeimagecacheevent.v20200702;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeImageCacheEventRequest
* @Description 请求参数
*/
@Data
public class DescribeImageCacheEventRequest{
    /**镜像缓存ID*/
    @KsYunField(name="ImageCacheId")
    private String ImageCacheId;


}