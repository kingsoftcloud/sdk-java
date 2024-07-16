package ksyun.client.kci.deleteimagecache.v20200702;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteImageCacheRequest
* @Description 请求参数
*/
@Data
public class DeleteImageCacheRequest{
    /**镜像缓存ID*/
    @KsYunField(name="ImageCacheId")
    private String ImageCacheId;


}