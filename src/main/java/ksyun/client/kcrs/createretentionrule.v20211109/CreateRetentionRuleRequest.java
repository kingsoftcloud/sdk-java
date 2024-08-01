package ksyun.client.kcrs.createretentionrule.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateRetentionRuleRequest
* @Description 请求参数
*/
@Data
public class CreateRetentionRuleRequest{
    /**实例Id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

}