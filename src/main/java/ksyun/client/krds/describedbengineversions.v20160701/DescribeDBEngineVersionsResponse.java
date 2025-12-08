package ksyun.client.krds.describedbengineversions.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDBEngineVersionsResponse
* @Description DescribeDBEngineVersions 返回体
*/
@Data
@ToString
public class DescribeDBEngineVersionsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Engines")
        private EnginesDto Engines;

        @Data
        @ToString
        public static class EnginesDto {
            /***/
            @JsonProperty("MySQL")
            private List<MySQLDto> MySQL;

            @Data
            @ToString
            public static class MySQLDto {
                /**DBEngineVersions
*/
                @JsonProperty("Engine")
                private String Engine;

                /**DBEngineVersions
*/
                @JsonProperty("EngineVersion")
                private String EngineVersion;

            }

            /***/
            @JsonProperty("consistent_mysql")
            private List<Consistent_mysqlDto> Consistent_mysql;

            @Data
            @ToString
            public static class Consistent_mysqlDto {
                /**DBEngineVersions
*/
                @JsonProperty("Engine")
                private String Engine;

                /**DBEngineVersions
*/
                @JsonProperty("EngineVersion")
                private String EngineVersion;

            }

            /***/
            @JsonProperty("Percona")
            private List<PerconaDto> Percona;

            @Data
            @ToString
            public static class PerconaDto {
                /**DBEngineVersions
*/
                @JsonProperty("Engine")
                private String Engine;

                /**DBEngineVersions
*/
                @JsonProperty("EngineVersion")
                private String EngineVersion;

            }

            /***/
            @JsonProperty("ebs_mysql")
            private List<Ebs_mysqlDto> Ebs_mysql;

            @Data
            @ToString
            public static class Ebs_mysqlDto {
                /**DBEngineVersions
*/
                @JsonProperty("Engine")
                private String Engine;

                /**DBEngineVersions
*/
                @JsonProperty("EngineVersion")
                private String EngineVersion;

            }

        }

    }

}
