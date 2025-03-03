package ksyun.client.iam.getgroup.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetGroupRequest
 * @Description 请求参数
 */
@Data
public class GetGroupRequest {
    /**
     * 用户组名称
     */
    @KsYunField(name = "GroupName")
    private String GroupName;

    /**
     * 最大返回个数，默认值100
     */
    @KsYunField(name = "MaxItems")
    private String MaxItems;

    /**
     * 当返回结果被截断时，使用本次返回的Marker值用于标示下次调用查询用户操作的起始点
     */
    @KsYunField(name = "Marker")
    private String Marker;

}