package ksyun.client.rabbitmq.listinstanceplugins.v20191017;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListInstancePluginsResponse
* @Description ListInstancePlugins 返回体
*/
@Data
@ToString
public class ListInstancePluginsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

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
        @JsonProperty("InstanceStatus")
        private String InstanceStatus;

        /***/
        @JsonProperty("Plugins")
        private List<PluginsDto> Plugins;

        @Data
        @ToString
        public static class PluginsDto {
            /***/
            @JsonProperty("PluginName")
            private String PluginName;

            /***/
            @JsonProperty("PluginStatus")
            private Integer PluginStatus;

        }

    }

}
