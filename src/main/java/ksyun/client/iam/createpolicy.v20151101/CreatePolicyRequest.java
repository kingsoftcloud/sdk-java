package ksyun.client.iam.createpolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreatePolicyRequest
* @Description 请求参数
*/
@Data
public class CreatePolicyRequest{
    /**待创建策略的策略名称
最短1,最长128*/
    @KsYunField(name="PolicyName")
    private String PolicyName;

    /**策略描述*/
    @KsYunField(name="Description")
    private String Description;

    /**待创建的自定义策略的策略文档内容
最短1,最长5K*/
    @KsYunField(name="PolicyDocument")
    private String PolicyDocument;

    /***/
    @KsYunField(name="PolicyStruct")
    private String PolicyStruct;

    /***/
    @KsYunField(name="CreateMode")
    private String CreateMode;


}