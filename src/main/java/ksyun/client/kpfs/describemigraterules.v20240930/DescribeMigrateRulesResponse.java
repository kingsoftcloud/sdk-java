package ksyun.client.kpfs.describemigraterules.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMigrateRulesResponse
* @Description DescribeMigrateRules 返回体
*/
@Data
@ToString
public class DescribeMigrateRulesResponse extends BaseResponseModel {

    /**数据迁移规则列表。*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**数据迁移规则ID。*/
        @JsonProperty("RuleId")
        private String RuleId;

        /**数据迁移规则名称。*/
        @JsonProperty("RuleName")
        private String RuleName;

        /**地域信息。*/
        @JsonProperty("Region")
        private String Region;

        /**数据源存储。*/
        @JsonProperty("SourceAddress")
        private DataSourceAddressDto SourceAddress;

        @Data
        @ToString
        public static class DataSourceAddressDto {
            /**数据源存储类型，返回KS3或KPFS。*/
            @JsonProperty("AddressType")
            private String AddressType;

            /**若为KPFS，则代表KPFS文件系统ID。*/
            @JsonProperty("FileSystemId")
            private String FileSystemId;

            /**若为KPFS，则代表KPFS文件系统名称。2026/6/12新增。*/
            @JsonProperty("FileSystemName")
            private String FileSystemName;

            /**若为KPFS，则为KPFS文件系统目录完整绝对路径。若不设置，则返回空；若设置，则按设置的路径返回。*/
            @JsonProperty("Path")
            private String Path;

            /**KS3 桶名。*/
            @JsonProperty("BucketName")
            private String BucketName;

            /**KS3 Bucket前缀。若不设置，则返回空；若设置，则按设置的前缀返回。*/
            @JsonProperty("BucketPrefix")
            private String BucketPrefix;

        }

        /**数据目标存储。*/
        @JsonProperty("TargetAddress")
        private DataTargetAddressDto TargetAddress;

        @Data
        @ToString
        public static class DataTargetAddressDto {
            /**数据目标存储类型，返回KS3或KPFS。*/
            @JsonProperty("AddressType")
            private String AddressType;

            /**若为KPFS，则代表KPFS文件系统ID。*/
            @JsonProperty("FileSystemId")
            private String FileSystemId;

            /**若为KPFS，则代表KPFS文件系统名称。2026/6/12新增。*/
            @JsonProperty("FileSystemName")
            private String FileSystemName;

            /**若为KPFS，则为KPFS文件系统目录完整绝对路径。若不设置，则返回空；若设置，则按设置的路径返回。*/
            @JsonProperty("Path")
            private String Path;

            /**KS3 桶名。*/
            @JsonProperty("BucketName")
            private String BucketName;

            /**KS3 Bucket前缀。若不设置，则返回空；若设置，则按设置的前缀返回。*/
            @JsonProperty("BucketPrefix")
            private String BucketPrefix;

        }

        /**数据迁移规则创建时间。*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

    /**分页大小。*/
    @JsonProperty("PageSize")
    private Long PageSize;

    /**页码。*/
    @JsonProperty("PageNum")
    private Long PageNum;

    /**数据迁移规则总数。*/
    @JsonProperty("TotalCount")
    private Long TotalCount;

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
