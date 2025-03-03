package ksyun.client.kcs.describerestoretimepoints.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeRestoreTimePointsRequest
 * @Description 请求参数
 */
@Data
public class DescribeRestoreTimePointsRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

}