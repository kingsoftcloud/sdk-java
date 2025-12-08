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
        private DataDtoEnginesDto Engines;

        @Data
        @ToString
        public static class DataDtoEnginesDto {
            /***/
            @JsonProperty("MySQL")
            private List<DataDtoEnginesDtoMySQLDto> MySQL;

            @Data
            @ToString
            public static class DataDtoEnginesDtoMySQLDto {
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
            private List<DataDtoEnginesDtoConsistent_mysqlDto> Consistent_mysql;

            @Data
            @ToString
            public static class DataDtoEnginesDtoConsistent_mysqlDto {
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
            private List<DataDtoEnginesDtoPerconaDto> Percona;

            @Data
            @ToString
            public static class DataDtoEnginesDtoPerconaDto {
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
            private List<DataDtoEnginesDtoEbs_mysqlDto> Ebs_mysql;

            @Data
            @ToString
            public static class DataDtoEnginesDtoEbs_mysqlDto {
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
