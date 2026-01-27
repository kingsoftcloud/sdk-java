package ksyun.client.aicp.describemodels.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeModelsResponse
* @Description DescribeModels 返回体
*/
@Data
@ToString
public class DescribeModelsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**总数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**每页数量*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**模型列表*/
    @JsonProperty("ModelSet")
    private List<ModelSetDto> ModelSet;

    @Data
    @ToString
    public static class ModelSetDto {
        /**模型ID*/
        @JsonProperty("ModelId")
        private String ModelId;

        /**模型名称*/
        @JsonProperty("ModelName")
        private String ModelName;

        /**模型描述*/
        @JsonProperty("ModelDescription")
        private String ModelDescription;

        /**版本数量*/
        @JsonProperty("ModelVersionCount")
        private Integer ModelVersionCount;

        /**创建用户*/
        @JsonProperty("CreateUser")
        private String CreateUser;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**访问权限列表*/
        @JsonProperty("AccessList")
        private List<ModelSetAccessListDto> AccessList;

        @Data
        @ToString
        public static class ModelSetAccessListDto {
            /**用户ID*/
            @JsonProperty("UserId")
            private String UserId;

            /**模型权限，有效值：writer(可读写), reader(只读)*/
            @JsonProperty("Permission")
            private String Permission;

        }

    }

}
