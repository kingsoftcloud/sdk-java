package ksyun.client.kce.addclusterinstancetonodepool.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddClusterInstanceToNodePoolResponse
* @Description AddClusterInstanceToNodePool 返回体
*/
@Data
@ToString
public class AddClusterInstanceToNodePoolResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceSet")
    private List<InstanceSetDto> InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**节点ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**执行结果*/
        @JsonProperty("Return")
        private Boolean ReturnField;

        /**添加成功，该字段返回为空；添加失败，返回失败的原因*/
        @JsonProperty("Message")
        private String Message;

    }

}
