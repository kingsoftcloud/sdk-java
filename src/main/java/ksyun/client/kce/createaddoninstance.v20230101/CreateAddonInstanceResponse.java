package ksyun.client.kce.createaddoninstance.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAddonInstanceResponse
* @Description CreateAddonInstance 返回体
*/
@Data
@ToString
public class CreateAddonInstanceResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回数据*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**示例ID*/
        @JsonProperty("InstanceIds")
        private List<String> InstanceIds;

    }

}
