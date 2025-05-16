package ksyun.client.kcs.describerestoretimepoints.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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