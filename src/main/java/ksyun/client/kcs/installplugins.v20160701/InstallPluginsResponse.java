package ksyun.client.kcs.installplugins.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname InstallPluginsResponse
* @Description InstallPlugins 返回体
*/
@Data
@ToString
public class InstallPluginsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Error")
    private String Error;

}
