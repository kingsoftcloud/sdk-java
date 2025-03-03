package ksyun.client.kcrs.modifyinstancetokenstatus.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyInstanceTokenStatusRequest
 * @Description 请求参数
 */
@Data
public class ModifyInstanceTokenStatusRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 实例访问凭证的id
     */
    @KsYunField(name = "TokenId")
    private String TokenId;

    /**
     * 启用/禁用实例访问凭证，有效值：<br/>True：启用<br/>False：禁用
     */
    @KsYunField(name = "Enable")
    private String Enable;


}