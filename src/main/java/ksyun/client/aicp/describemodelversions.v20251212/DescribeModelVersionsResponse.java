package ksyun.client.aicp.describemodelversions.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeModelVersionsResponse
 * @Description DescribeModelVersions 返回体
 */
@Data
@ToString
public class DescribeModelVersionsResponse extends BaseResponseModel {

    /**
     * 请求ID
     */
    @JsonProperty("RequestId")
    private String RequestId;

    /**
     * 总数量
     */
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**
     * 页码
     */
    @JsonProperty("Page")
    private Integer Page;

    /**
     * 每页数量
     */
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**
     * 模型版本列表
     */
    @JsonProperty("ModelVersionSet")
    private List<ModelVersionSetDto> ModelVersionSet;

    @Data
    @ToString
    public static class ModelVersionSetDto {
        /**
         * 模型ID
         */
        @JsonProperty("ModelId")
        private String ModelId;

        /**
         * 模型版本ID
         */
        @JsonProperty("ModelVersionId")
        private String ModelVersionId;

        /**
         * 模型版本名称
         */
        @JsonProperty("ModelVersionName")
        private String ModelVersionName;

        /**
         * 模型版本描述
         */
        @JsonProperty("ModelVersionDescription")
        private String ModelVersionDescription;

        /**
         * 来源类型
         */
        @JsonProperty("SourceType")
        private String SourceType;

        /**
         * 模型格式
         */
        @JsonProperty("Format")
        private String Format;

        /**
         * 框架
         */
        @JsonProperty("Framework")
        private String Framework;

        /**
         * 存储配置ID
         */
        @JsonProperty("StorageConfigId")
        private String StorageConfigId;

        /**
         * 创建时间
         */
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**
         * 更新时间
         */
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

}
