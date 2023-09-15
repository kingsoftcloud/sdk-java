package ksyun.client.memcached.describecachecluster.v20180627;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCacheClusterRequest
* @Description 请求参数
*/
@Data
public class DescribeCacheClusterRequest{
    /**缓存服务ID*/
    @KsYunField(name="CacheId")
    private String CacheId;

    /**缓存服务引擎 	 取固定值： memcached*/
    @KsYunField(name="Engine")
    private String Engine;


}