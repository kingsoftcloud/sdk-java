package ksyun.client.rabbitmq.disableinstanceplugins.v20191017;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DisableInstancePluginsResponse
* @Description DisableInstancePlugins 返回体
*/
@Data
@ToString
public class DisableInstancePluginsResponse extends BaseResponseModel {

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
        @JsonProperty("InstanceId")
        private String InstanceId;

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
            @JsonProperty("PluginStatus")
            private Integer PluginStatus;

        }

    }

}
