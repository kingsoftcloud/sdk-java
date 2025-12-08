package ksyun.client.ter.describestackevents.v20240415;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeStackEventsRequest
* @Description 请求参数
*/
@Data
public class DescribeStackEventsRequest{
    /**资源栈ID*/
    @KsYunField(name="StackId")
    private String StackId;

    /**单次调用所返回的最大资源栈数目，取值范围5-1000*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**页码数 从1开始*/
    @KsYunField(name="Offset")
    private Integer Offset;

}
