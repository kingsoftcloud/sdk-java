package ksyun.client.kce.addclusterepcinstances.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddClusterEpcInstancesResponse
* @Description AddClusterEpcInstances 返回体
*/
@Data
@ToString
public class AddClusterEpcInstancesResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceSet")
    private List<InstanceSetDto> InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**执行结果*/
        @JsonProperty("Return")
        private Boolean ReturnField;

        /**裸金属服务器实例id*/
        @JsonProperty("InstanceId")
        private String InstanceId;

    }

}
