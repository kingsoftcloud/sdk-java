package ksyun.client.kce.deletenodepool.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteNodePoolResponse
* @Description DeleteNodePool 返回体
*/
@Data
@ToString
public class DeleteNodePoolResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**调用结果*/
    @JsonProperty("ReturnSet")
    private List<ReturnSetDto> ReturnSet;

    @Data
    @ToString
    public static class ReturnSetDto {
        /**伸缩组ID*/
        @JsonProperty("ScalingGroupId")
        private String ScalingGroupId;

        /**如果删除失败，则会展示报错详情；如删除成功，则返回为null*/
        @JsonProperty("Message")
        private String Message;

        /**执行结果*/
        @JsonProperty("Return")
        private Boolean ReturnField;

    }

}
