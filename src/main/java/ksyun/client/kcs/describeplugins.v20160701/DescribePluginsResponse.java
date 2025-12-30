package ksyun.client.kcs.describeplugins.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePluginsResponse
* @Description DescribePlugins 返回体
*/
@Data
@ToString
public class DescribePluginsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Plugins")
        private List<DataPluginsDto> Plugins;

        @Data
        @ToString
        public static class DataPluginsDto {
            /***/
            @JsonProperty("PluginName")
            private String PluginName;

            /***/
            @JsonProperty("EnableUninstall")
            private Boolean EnableUninstall;

            /***/
            @JsonProperty("UpgradeVersions")
            private List<String> UpgradeVersions;

            /***/
            @JsonProperty("Description")
            private String Description;

        }

        /***/
        @JsonProperty("Total")
        private Integer Total;

    }

}
