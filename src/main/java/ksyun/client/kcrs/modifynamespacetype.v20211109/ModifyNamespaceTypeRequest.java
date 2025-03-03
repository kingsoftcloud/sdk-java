package ksyun.client.kcrs.modifynamespacetype.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyNamespaceTypeRequest
 * @Description 请求参数
 */
@Data
public class ModifyNamespaceTypeRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 命名空间名称
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

    /**
     * 命名空间属性，有效值：<br/>True：公有<br/>False：私有
     */
    @KsYunField(name = "Public")
    private String Public;

}