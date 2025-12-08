package ksyun.client.postgresql.describedbengineversions.v20181225;

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
            @JsonProperty("PostgerSQL")
            private List<PostgerSQLDto> PostgerSQL;

            @Data
            @ToString
            public static class PostgerSQLDto {
                /**引擎类型*/
                @JsonProperty("Engine")
                private String Engine;

                /**引擎版本*/
                @JsonProperty("EngineVersion")
                private String EngineVersion;

                /**当前引擎最新小版本*/
                @JsonProperty("MinorVersion")
                private String MinorVersion;

            }

        }

    }

}
