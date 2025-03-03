package ksyun.client.kcs.describecreatesnapshotstatus.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCreateSnapshotStatusRequest
 * @Description 请求参数
 */
@Data
public class DescribeCreateSnapshotStatusRequest {
    /**
     * 缓存服务ID(实例ID)
     */
    @KsYunField(name = "CacheId")
    private String CacheId;


}