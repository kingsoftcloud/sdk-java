package ksyun.client.kcf.describeautoscaledtriggers.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAutoScaledTriggersRequest
* @Description 请求参数
*/
@Data
public class DescribeAutoScaledTriggersRequest{
    /***/
    @KsYunField(name="FunctionId")
    private String FunctionId;

    /**触发器名称*/
    @KsYunField(name="Name")
    private String Name;

    /**触发器类型*/
    @KsYunField(name="Type")
    private String Type;

}
