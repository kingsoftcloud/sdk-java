package ksyun.client.klog.listprojects.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListProjectsResponse
* @Description ListProjects 返回体
*/
@Data
@ToString
public class ListProjectsResponse extends BaseResponseModel {
    /**数据总量*/
    @JsonProperty("Total")
    private Integer Total;

    /**返回行数*/
    @JsonProperty("Count")
    private Integer Count;

    /**工程列表*/
    @JsonProperty("Projects")
    private List<ProjectsDto> Projects;

    @Data
    @ToString
    public static class ProjectsDto {
        /**工程名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**项目制名称*/
        @JsonProperty("IamProjectName")
        private String IamProjectName;

        /**项目ID*/
        @JsonProperty("IamProjectId")
        private Integer IamProjectId;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**修改时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**区域*/
        @JsonProperty("Region")
        private String Region;

        /**状态*/
        @JsonProperty("Status")
        private String Status;

        /**包含日志池数量*/
        @JsonProperty("LogPoolNum")
        private Integer LogPoolNum;

        /**标签列表*/
        @JsonProperty("Tags")
        private List<ProjectsDtoTagsDto> Tags;

        @Data
        @ToString
        public static class ProjectsDtoTagsDto {
            /**标签ID*/
            @JsonProperty("ID")
            private Integer ID;

            /**标签键*/
            @JsonProperty("Key")
            private String Key;

            /**标签值*/
            @JsonProperty("Value")
            private String Value;

        }

    }

}
