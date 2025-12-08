package ksyun.client.iam.projectsinfobyinstanceids.v20240703;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ProjectsInfoByInstanceIdsResponse
* @Description ProjectsInfoByInstanceIds 返回体
*/
@Data
@ToString
public class ProjectsInfoByInstanceIdsResponse extends BaseResponseModel {
    /**实例、项目信息*/
    @JsonProperty("List")
    private List<ListDto> List;

    @Data
    @ToString
    public static class ListDto {
        /**产品资源标识*/
        @JsonProperty("ProductLine")
        private String ProductLine;

        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**机房*/
        @JsonProperty("Region")
        private String Region;

        /**项目ID*/
        @JsonProperty("ProjectId")
        private Integer ProjectId;

        /**项目名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**项目描述*/
        @JsonProperty("ProjectDesc")
        private String ProjectDesc;

    }

    /**查询出实例项目信息数量*/
    @JsonProperty("Total")
    private Integer Total;

    /**请求结果ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
