package ksyun.client.epc.describevpns.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeVpnsRequest
 * @Description 请求参数
 */
@Data
public class DescribeVpnsRequest {
    /**
     * 手机动态码
     */
    @KsYunField(name = "DynamicCode")
    private String DynamicCode;

    /**
     * 个人识别码
     */
    @KsYunField(name = "Pin")
    private String Pin;

    /**
     * 带外管理的ID
     */
    @KsYunField(name = "RemoteManagementId")
    private String RemoteManagementId;


}