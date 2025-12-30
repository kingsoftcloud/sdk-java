package ksyun.client.klog.describeproject.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeProjectResponse
* @Description DescribeProject 返回体
*/
@Data
@ToString
public class DescribeProjectResponse extends BaseResponseModel {

    /**工程名称*/
    @JsonProperty("ProjectName")
    private String ProjectName;

    /**项目制名称*/
    @JsonProperty("IamProjectName")
    private String IamProjectName;

    /**项目制ID*/
    @JsonProperty("IamProjectId")
    private Integer IamProjectId;

    /**工程创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**工程更新时间*/
    @JsonProperty("UpdateTime")
    private String UpdateTime;

    /**区域编码*/
    @JsonProperty("Region")
    private String Region;

    /**工程状态*/
    @JsonProperty("Status")
    private String Status;

    /**标签列表*/
    @JsonProperty("Tags")
    private List<TagsDto> Tags;

    @Data
    @ToString
    public static class TagsDto {
        /**标签ID*/
        @JsonProperty("Id")
        private Integer Id;

        /**标签键*/
        @JsonProperty("Key")
        private String Key;

        /**标签值*/
        @JsonProperty("Value")
        private String Value;

    }

}
