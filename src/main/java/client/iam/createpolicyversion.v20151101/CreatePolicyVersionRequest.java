package client.iam.createpolicyversion.v20151101;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreatePolicyVersionRequest
* @Description 请求参数
*/
@Data
public class CreatePolicyVersionRequest{
    /**待创建新版本的策略的唯一标识
格式：krn:ksc:iam::account-id:policy/policy-name*/
    @KsYunField(name="PolicyKrn")
    private String PolicyKrn;

    /**待创建新策略版本的策略文档内容*/
    @KsYunField(name="PolicyDocument")
    private String PolicyDocument;

    /**可选参数，用于设置是否将新创建的策略版本指定为默认策略版本*/
    @KsYunField(name="SetAsDefault")
    private String SetAsDefault;

    /***/
    @KsYunField(name="PolicyStruct")
    private String PolicyStruct;


}