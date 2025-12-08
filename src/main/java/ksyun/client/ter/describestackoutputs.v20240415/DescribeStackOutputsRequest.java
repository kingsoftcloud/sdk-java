package ksyun.client.ter.describestackoutputs.v20240415;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeStackOutputsRequest
* @Description 请求参数
*/
@Data
public class DescribeStackOutputsRequest{
    /**资源栈ID*/
    @KsYunField(name="StackId")
    private String StackId;

}
