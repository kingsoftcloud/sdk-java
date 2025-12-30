package ksyun.client.rabbitmq.supportplugins.v20191017;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SupportPluginsResponse
* @Description SupportPlugins 返回体
*/
@Data
@ToString
public class SupportPluginsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("PluginName")
        private String PluginName;

        /***/
        @JsonProperty("NeedToRestart")
        private Boolean NeedToRestart;

    }

}
