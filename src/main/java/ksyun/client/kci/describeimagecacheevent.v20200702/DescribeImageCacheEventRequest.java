package ksyun.client.kci.describeimagecacheevent.v20200702;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeImageCacheEventRequest
 * @Description 请求参数
 */
@Data
public class DescribeImageCacheEventRequest {
    /**
     * 镜像缓存ID
     */
    @KsYunField(name = "ImageCacheId")
    private String ImageCacheId;

}