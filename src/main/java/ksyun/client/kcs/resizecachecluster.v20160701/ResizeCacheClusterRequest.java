package ksyun.client.kcs.resizecachecluster.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ResizeCacheClusterRequest
 * @Description 请求参数
 */
@Data
public class ResizeCacheClusterRequest {
    /**
     * 可用区       	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID。
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 更配目标容量。 	 缓存资源为单主从模式时，可选值为：{1, 2, 4, 8, 16, 32, 64}。
     */
    @KsYunField(name = "Capacity")
    private Integer Capacity;

    /**
     * 仅集群实例使用。shardSize和shardNum不能同时更配，只能一次更配这两种参数中的一种。范围可参照创建实例的范围。自定义集群暂不支持降配。
     */
    @KsYunField(name = "ShardSize")
    private Integer ShardSize;

    /**
     * 仅集群实例使用。shardSize和shardNum不能同时更配，只能一次更配这两种参数中的一种。范围可参照创建实例的范围。自定义集群暂不支持降配。
     */
    @KsYunField(name = "ShardNum")
    private Integer ShardNum;

}