package ksyun.client.kce.deleteclusterinstances.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteClusterInstancesResponse
* @Description DeleteClusterInstances 返回体
*/
@Data
@ToString
public class DeleteClusterInstancesResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceSet")
    private List<InstanceSetDto> InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**如果删除失败，则会展示报错详情；如删除成功，则返回为null*/
        @JsonProperty("Message")
        private String Message;

        /**删除结果*/
        @JsonProperty("Return")
        private Boolean ReturnField;

        /**实例id*/
        @JsonProperty("InstanceId")
        private String InstanceId;

    }

}
