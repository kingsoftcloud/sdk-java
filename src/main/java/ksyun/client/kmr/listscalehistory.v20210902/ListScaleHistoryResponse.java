package ksyun.client.kmr.listscalehistory.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListScaleHistoryResponse
* @Description ListScaleHistory 返回体
*/
@Data
@ToString
public class ListScaleHistoryResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**集群ID*/
    @JsonProperty("ClusterId")
    private String ClusterId;

    /**策略的执行历史

*/
    @JsonProperty("ScaleHistories")
    private List<ScaleHistoriesDto> ScaleHistories;

    @Data
    @ToString
    public static class ScaleHistoriesDto {
        /**策略开始执行时间

*/
        @JsonProperty("StartTime")
        private String StartTime;

        /**策略的历史ID*/
        @JsonProperty("ScaleHistoryId")
        private String ScaleHistoryId;

        /**策略名称

*/
        @JsonProperty("StrategyName")
        private String StrategyName;

        /**策略的扩缩类型

*/
        @JsonProperty("Action")
        private String Action;

        /**策略的类型

*/
        @JsonProperty("StrategyModule")
        private String StrategyModule;

        /**策略执行的Task组ID*/
        @JsonProperty("InstanceGroupId")
        private String InstanceGroupId;

        /**策略本次操作的实例数量

*/
        @JsonProperty("InstanceCount")
        private Integer InstanceCount;

        /**策略执行结果状态

*/
        @JsonProperty("Status")
        private String Status;

        /**策略执行结果描述信息

*/
        @JsonProperty("Result")
        private String Result;

        /**策略执行前，Task组的实例数量

*/
        @JsonProperty("PreviousCount")
        private Integer PreviousCount;

        /**策略执行后，Task组的实例数量

*/
        @JsonProperty("FinalCount")
        private Integer FinalCount;

        /**是否新建Task

*/
        @JsonProperty("AutoCreatedInstanceGroup")
        private Boolean AutoCreatedInstanceGroup;

        /**已废弃，默认为空字符串*/
        @JsonProperty("LabelId")
        private String LabelId;

        /**扩缩的实例资源类型

*/
        @JsonProperty("ResourceType")
        private String ResourceType;

    }

    /**总数*/
    @JsonProperty("Total")
    private Integer Total;

    /**状态码

*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
