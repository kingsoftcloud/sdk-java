package ksyun.client.kce.deleteclusterinstancesfromnodepool.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteClusterInstancesFromNodePoolResponse
* @Description DeleteClusterInstancesFromNodePool 返回体
*/
@Data
@ToString
public class DeleteClusterInstancesFromNodePoolResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceSet")
    private List<InstanceSetDto> InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**节点id*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**执行结果*/
        @JsonProperty("Return")
        private Boolean ReturnField;

        /**如果删除失败，则会展示报错详情；如删除成功，则返回为null*/
        @JsonProperty("Message")
        private String Message;

    }

}
