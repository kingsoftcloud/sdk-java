package ksyun.client.aicp.describetrainjobevents.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTrainJobEventsResponse
* @Description DescribeTrainJobEvents 返回体
*/
@Data
@ToString
public class DescribeTrainJobEventsResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**事件记录*/
    @JsonProperty("DataSet")
    private List<DataSetDto> DataSet;

    @Data
    @ToString
    public static class DataSetDto {
        /**首次出现时间*/
        @JsonProperty("FirstSeen")
        private String FirstSeen;

        /**最后出现时间*/
        @JsonProperty("LastSeen")
        private String LastSeen;

        /**类型*/
        @JsonProperty("Type")
        private String Type;

        /**事件对象*/
        @JsonProperty("Object")
        private DataSetObjectDto Object;

        @Data
        @ToString
        public static class DataSetObjectDto {
            /**对象类型*/
            @JsonProperty("Kind")
            private String Kind;

            /**命名空间*/
            @JsonProperty("Namespace")
            private String Namespace;

            /**对象名称*/
            @JsonProperty("Name")
            private String Name;

        }

        /**原因*/
        @JsonProperty("Reason")
        private String Reason;

        /**具体信息*/
        @JsonProperty("Message")
        private String Message;

        /**事件源*/
        @JsonProperty("Source")
        private DataSetSourceDto Source;

        @Data
        @ToString
        public static class DataSetSourceDto {
            /**组件*/
            @JsonProperty("component")
            private String Component;

        }

        /**事件数*/
        @JsonProperty("Count")
        private Integer Count;

    }

}
