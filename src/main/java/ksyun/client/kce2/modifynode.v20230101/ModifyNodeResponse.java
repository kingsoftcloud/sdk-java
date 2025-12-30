package ksyun.client.kce2.modifynode.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyNodeResponse
* @Description ModifyNode 返回体
*/
@Data
@ToString
public class ModifyNodeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ClusterId")
    private String ClusterId;

    /***/
    @JsonProperty("InstanceId")
    private String InstanceId;

    /***/
    @JsonProperty("Components")
    private List<ComponentsDto> Components;

    @Data
    @ToString
    public static class ComponentsDto {
        /***/
        @JsonProperty("Type")
        private String Type;

    }

}
