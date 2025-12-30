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
        private DataEnginesDto Engines;

        @Data
        @ToString
        public static class DataEnginesDto {
            /***/
            @JsonProperty("MySQL")
            private List<DataEnginesMySQLDto> MySQL;

            @Data
            @ToString
            public static class DataEnginesMySQLDto {
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
            private List<DataEnginesConsistent_mysqlDto> Consistent_mysql;

            @Data
            @ToString
            public static class DataEnginesConsistent_mysqlDto {
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
            private List<DataEnginesPerconaDto> Percona;

            @Data
            @ToString
            public static class DataEnginesPerconaDto {
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
            private List<DataEnginesEbs_mysqlDto> Ebs_mysql;

            @Data
            @ToString
            public static class DataEnginesEbs_mysqlDto {
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
