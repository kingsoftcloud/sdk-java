package ksyun.client.aicp.describemodelchats.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeModelChatsRequest
* @Description 请求参数
*/
@Data
public class DescribeModelChatsRequest{
    /***/
    @KsYunField(name="ChatId")
    private String ChatId;

    /**创建时间区间起始，毫秒时间戳*/
    @KsYunField(name="CreateTimeStart")
    private Integer CreateTimeStart;

    /**创建时间区间截止，毫秒时间戳*/
    @KsYunField(name="CreateTimeEnd")
    private Integer CreateTimeEnd;

    /**页码，从1开始。*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**页长，默认100*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

}