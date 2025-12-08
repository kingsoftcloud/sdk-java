package ksyun.client.kcs.describecachereadonlynode.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCacheReadonlyNodeRequest
* @Description 请求参数
*/
@Data
public class DescribeCacheReadonlyNodeRequest{
    /**实例Id。*/
    @KsYunField(name="CacheId")
    private String CacheId;

}
