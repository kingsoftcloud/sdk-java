package ksyun.client.actiontrail.listoperatelogs.v20190401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListOperateLogsRequest
* @Description 请求参数
*/
@Data
public class ListOperateLogsRequest{
    /**事件名称，为操作的接口Action名称*/
    @KsYunField(name="EventName")
    private String EventName;

    /**事件类型：read(读操作)，write(写操作)；不传则查询所有类型操作*/
    @KsYunField(name="EventRw")
    private String EventRw;

    /**服务名称*/
    @KsYunField(name="ServiceName")
    private String ServiceName;

    /**调用者的名称。
- 如果是主账号，显示为root。
- 如果为子用户未IAM子用户名称。*/
    @KsYunField(name="UserName")
    private String UserName;

    /**支持使用AccessKeyID查询对应调用事件记录。*/
    @KsYunField(name="AccessKey")
    private String AccessKey;

    /**事件开始日期，格式为YYYY-MM-DD*/
    @KsYunField(name="EventBeginDate")
    private String EventBeginDate;

    /**事件结束日期，格式为YYYY-MM-DD*/
    @KsYunField(name="EventEndDate")
    private String EventEndDate;

    /**资源类型*/
    @KsYunField(name="ResourceType")
    private String ResourceType;

    /**资源名称*/
    @KsYunField(name="ResourceName")
    private String ResourceName;

    /**页码，默认1*/
    @KsYunField(name="Page")
    private String Page;

    /**每页查询个数，默认10*/
    @KsYunField(name="PageSize")
    private String PageSize;

    /**上次请求返回的最后一条数据的游标*/
    @KsYunField(name="SearchAfter")
    private String SearchAfter;

}
