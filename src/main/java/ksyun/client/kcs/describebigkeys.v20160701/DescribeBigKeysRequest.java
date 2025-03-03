package ksyun.client.kcs.describebigkeys.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeBigKeysRequest
 * @Description 请求参数
 */
@Data
public class DescribeBigKeysRequest {
    /**
     * 缓存服务ID(实例ID)
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

}