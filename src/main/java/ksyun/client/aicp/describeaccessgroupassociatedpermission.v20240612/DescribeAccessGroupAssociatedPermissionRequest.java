package ksyun.client.aicp.describeaccessgroupassociatedpermission.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAccessGroupAssociatedPermissionRequest
* @Description 请求参数
*/
@Data
public class DescribeAccessGroupAssociatedPermissionRequest{
    /**权限组ID，36位*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**资源类型，枚举值：
- Queue，队列
- Dataset，存储配置
- Image，镜像
- Model，模型
- ImageRegistry，第三方镜像配置*/
    @KsYunField(name="ResourceType")
    private String ResourceType;

}
