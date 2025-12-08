package ksyun.client.kce.addexistedinstances.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddExistedInstancesResponse
* @Description AddExistedInstances 返回体
*/
@Data
@ToString
public class AddExistedInstancesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("InstanceSet")
    private List<InstanceSetDto> InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**实例id*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**添加结果*/
        @JsonProperty("Return")
        private Boolean ReturnField;

        /**添加成功，该字段返回为空；添加失败，返回失败的原因。*/
        @JsonProperty("Reason")
        private String Reason;

    }

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
