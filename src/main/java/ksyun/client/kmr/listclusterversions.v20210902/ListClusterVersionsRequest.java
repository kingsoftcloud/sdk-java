package ksyun.client.kmr.listclusterversions.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListClusterVersionsRequest
 * @Description 请求参数
 */
@Data
public class ListClusterVersionsRequest {
    /**
     * KMR 集群类型
     * 可选值：
     * - Hadoop
     * - Kafka
     * - Zookeeper
     * - RocketMQ
     */
    @KsYunField(name = "DistributionVersion")
    private String DistributionVersion;

}