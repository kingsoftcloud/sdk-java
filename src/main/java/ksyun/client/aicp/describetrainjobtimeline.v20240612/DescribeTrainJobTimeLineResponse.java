package ksyun.client.aicp.describetrainjobtimeline.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTrainJobTimeLineResponse
* @Description DescribeTrainJobTimeLine 返回体
*/
@Data
@ToString
public class DescribeTrainJobTimeLineResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**训练任务ID*/
    @JsonProperty("TrainJobId")
    private String TrainJobId;

    /**时间线事件列表*/
    @JsonProperty("EventList")
    private List<EventListDto> EventList;

    @Data
    @ToString
    public static class EventListDto {
        /**事件触发模式, 有效值：manual(手动操作), automatic(自动触发)*/
        @JsonProperty("Mode")
        private String Mode;

        /**事件动作, 有效值：submit(创建中), pending(排队中), running(运行中), stopping(停止中), stopped(已停止), failed(失败), failed_holding(失败保留中), succeed(成功), succeed_holding(成功保留中), restarting(重启中), abnormal(异常), deploying(部署中)*/
        @JsonProperty("Action")
        private String Action;

        /**事件发生的原因, 有效值：queue_delete(队列被删除), self_healing(训练任务故障自愈), user_operate(用户手动操作), job_timeout(训练任务超时), descheduler_stop(节点碎片整理停止)*/
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

    }

}
