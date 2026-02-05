package ksyun.client.cdn.getrefreshorpreloadtask.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetRefreshOrPreloadTaskResponse
* @Description GetRefreshOrPreloadTask 返回体
*/
@Data
@ToString
public class GetRefreshOrPreloadTaskResponse extends BaseResponseModel {

    /***/
    @JsonProperty("StartTime")
    private String StartTime;

    /**结束时间*/
    @JsonProperty("EndTime")
    private String EndTime;

    /**查询的URL列表*/
    @JsonProperty("Urls")
    private List<UrlsDto> Urls;

    @Data
    @ToString
    public static class UrlsDto {
        /**需要查询的Url路径*/
        @JsonProperty("Url")
        private String Url;

    }

    /**整页大小*/
    @JsonProperty("PageSize")
    private Long PageSize;

    /**页码*/
    @JsonProperty("PageNumber")
    private Long PageNumber;

    /**Url总条数*/
    @JsonProperty("TotalCount")
    private Long TotalCount;

    /**刷新或预热任务进度百分比及状态信息*/
    @JsonProperty("Datas")
    private List<DatasDto> Datas;

    @Data
    @ToString
    public static class DatasDto {
        /**任务类别，取值为：refresh，刷新任务；取值为:preload，预热任务*/
        @JsonProperty("Type")
        private String Type;

        /**任务的细分类型，取值为：REFRESH_FILE表示URL刷新，REFRESH_DIR表示目录刷新，PRELOAD_FILE表示URL预热。注：PRELOAD_FILE不在请求传参SubType的取值范围里，单纯作为响应的类型值*/
        @JsonProperty("SubType")
        private String SubType;

        /**刷新或预热的Url地址*/
        @JsonProperty("Url")
        private String Url;

        /**刷新或预热任务进度百分比数值*/
        @JsonProperty("Progress")
        private Double Progress;

        /**刷新或预热状态信息，取值分别是success(成功)、progressing(进行中)、failed(刷新失败)*/
        @JsonProperty("Status")
        private String Status;

        /**任务ID，按照任务ID查询刷新或预热任务进度百分比及状态信息*/
        @JsonProperty("TaskId")
        private String TaskId;

    }

    /**任务创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

}
