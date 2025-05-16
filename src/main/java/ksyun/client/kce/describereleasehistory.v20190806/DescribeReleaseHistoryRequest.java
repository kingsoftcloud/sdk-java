package ksyun.client.kce.describereleasehistory.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeReleaseHistoryRequest
 * @Description 请求参数
 */
@Data
public class DescribeReleaseHistoryRequest {
    /**
     * 集群 Id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * Helm应用名称
     */
    @KsYunField(name = "ReleaseName")
    private String ReleaseName;

    /**
     * 命名空间
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

}