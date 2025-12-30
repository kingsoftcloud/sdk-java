package ksyun.client.kce.deleteaddoninstance.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAddonInstanceResponse
* @Description DeleteAddonInstance 返回体
*/
@Data
@ToString
public class DeleteAddonInstanceResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequesetId")
    private String RequesetId;

    /**返回数据*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
    }

    /**集群ID*/
    @JsonProperty("ClusterId")
    private String ClusterId;

    /**插件ID*/
    @JsonProperty("AddonId")
    private String AddonId;

}
