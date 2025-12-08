package ksyun.client.dts.describeconnconfig.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeConnConfigResponse
* @Description DescribeConnConfig 返回体
*/
@Data
@ToString
public class DescribeConnConfigResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("ConnConfig")
        private ConnConfigDto ConnConfig;

        @Data
        @ToString
        public static class ConnConfigDto {
            /**迁移配置ID*/
            @JsonProperty("Id")
            private String Id;

            /**当前登录用户ID(金山云平台主账号)*/
            @JsonProperty("AccountId")
            private String AccountId;

            /**迁移地域*/
            @JsonProperty("Region")
            private String Region;

            /**源端地域*/
            @JsonProperty("sourceRegion")
            private String SourceRegion;

            /**目标端地域*/
            @JsonProperty("targetRegion")
            private String TargetRegion;

            /**源端IP地址*/
            @JsonProperty("SourceHost")
            private String SourceHost;

            /**源端端口号*/
            @JsonProperty("SourcePort")
            private String SourcePort;

            /**源端用户名*/
            @JsonProperty("SourceUsername")
            private String SourceUsername;

            /**源端实例ID*/
            @JsonProperty("SourceInstanceId")
            private String SourceInstanceId;

            /**目标端实例ID*/
            @JsonProperty("TargetInstanceId")
            private String TargetInstanceId;

            /**目标主题*/
            @JsonProperty("TargetTopic")
            private String TargetTopic;

            /**源端类型*/
            @JsonProperty("SourceType")
            private String SourceType;

            /**目标端类型*/
            @JsonProperty("TargetType")
            private String TargetType;

            /**迁移结构，表示是否是全量迁移或者指定库表名的迁移(指定库表时可以改目标端对应的库表名)

注意：若是迁移类型不支持结构化迁移的话，是没法指定具体的库表信息的*/
            @JsonProperty("DbSchema")
            private DbSchemaDto DbSchema;

            @Data
            @ToString
            public static class DbSchemaDto {
                /***/
                @JsonProperty("is_full")
                private Boolean Is_full;

            }

        }

    }

}
