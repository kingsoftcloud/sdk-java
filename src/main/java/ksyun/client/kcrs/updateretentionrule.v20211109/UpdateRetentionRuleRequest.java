package ksyun.client.kcrs.updateretentionrule.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateRetentionRuleRequest
* @Description 请求参数
*/
@Data
public class UpdateRetentionRuleRequest{
    /**实例Id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

}