package ksyun.client.kcf.describetriggers.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTriggersRequest
* @Description 请求参数
*/
@Data
public class DescribeTriggersRequest{
    /**函数Id*/
    @KsYunField(name="FunctionId")
    private String FunctionId;

}
