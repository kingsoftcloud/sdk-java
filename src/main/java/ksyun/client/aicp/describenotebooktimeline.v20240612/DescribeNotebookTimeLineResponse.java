package ksyun.client.aicp.describenotebooktimeline.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNotebookTimeLineResponse
* @Description DescribeNotebookTimeLine 返回体
*/
@Data
@ToString
public class DescribeNotebookTimeLineResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**开发任务ID*/
    @JsonProperty("NotebookId")
    private String NotebookId;

    /**时间线事件列表*/
    @JsonProperty("EventList")
    private List<EventListDto> EventList;

    @Data
    @ToString
    public static class EventListDto {
        /**事件触发模式, 有效值：manual(手动操作), automatic(自动触发)*/
        @JsonProperty("Mode")
        private String Mode;

        /**事件动作, 有效值：submit(创建中), launched(排队中), pending(排队中), deploying(部署中), start(启动中), running(运行中), stopping(停止中), stopped(已停止), deleting(删除中), image_saving(镜像保存中), submit_failed(创建失败), failed(异常)*/
        @JsonProperty("Action")
        private String Action;

        /**事件发生的原因, 有效值：queue_clean(清理策略), queue_delete(队列被删除), user_operate(用户手动操作)*/
        @JsonProperty("Reason")
        private String Reason;

        /**操作者ID，manual模式为用户ID，automatic模式为kaic-system*/
        @JsonProperty("Operator")
        private String Operator;

        /**事件发生时间*/
        @JsonProperty("EventTime")
        private String EventTime;

        /**启动次数*/
        @JsonProperty("StartTimes")
        private Integer StartTimes;

        /**事件详情*/
        @JsonProperty("EventDetail")
        private EventListEventDetailDto EventDetail;

        @Data
        @ToString
        public static class EventListEventDetailDto {
            /**清理策略ID*/
            @JsonProperty("TerminatePolicyId")
            private String TerminatePolicyId;

        }

    }

}
