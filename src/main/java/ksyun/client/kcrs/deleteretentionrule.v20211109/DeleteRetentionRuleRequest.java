package ksyun.client.kcrs.deleteretentionrule.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteRetentionRuleRequest
* @Description 请求参数
*/
@Data
public class DeleteRetentionRuleRequest{
    /**实例Id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**参数实体类*/
    @KsYunField(name="Rule")


}