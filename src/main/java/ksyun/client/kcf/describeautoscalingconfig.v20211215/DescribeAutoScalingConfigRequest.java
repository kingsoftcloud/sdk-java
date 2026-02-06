package ksyun.client.kcf.describeautoscalingconfig.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAutoScalingConfigRequest
* @Description 请求参数
*/
@Data
public class DescribeAutoScalingConfigRequest{
    /***/
    @KsYunField(name="FunctionId")
    private String FunctionId;

}
