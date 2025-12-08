package ksyun.client.kcs.uninstallplugins.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UninstallPluginsResponse
* @Description UninstallPlugins 返回体
*/
@Data
@ToString
public class UninstallPluginsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
