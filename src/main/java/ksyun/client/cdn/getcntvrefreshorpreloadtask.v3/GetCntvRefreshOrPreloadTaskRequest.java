package ksyun.client.cdn.getcntvrefreshorpreloadtask.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetCntvRefreshOrPreloadTaskRequest
* @Description 请求参数
*/
@Data
public class GetCntvRefreshOrPreloadTaskRequest{
    /**开始时间，只能查询3天之内的任务
*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**支持按内容管理任务的类型查询，传参可取值：refresh、preload。其中，refresh表示刷新任务类型，preload表示预热任务类型，不传参表示查询所有类型。*/
    @KsYunField(name="Type")
    private String Type;

    /**支持按任务ID查询，只允许输入单个任务ID*/
    @KsYunField(name="TaskId")
    private String TaskId;

}
