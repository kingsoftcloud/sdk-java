package ksyun.client.kcs.flushcachecluster.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname FlushCacheClusterRequest
 * @Description 请求参数
 */
@Data
public class FlushCacheClusterRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID。
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 指定清除的数据库。若指定多个数据库，用","(逗号)隔开，如：如：DatabaseNo=0,1,2,3,4,5,6,7,8,9,10
     */
    @KsYunField(name = "DatabaseNo")
    private String DatabaseNo;

}