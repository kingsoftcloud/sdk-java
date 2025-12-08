package ksyun.client.aicp.describenotebookevents.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNotebookEventsResponse
* @Description DescribeNotebookEvents 返回体
*/
@Data
@ToString
public class DescribeNotebookEventsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**事件列表*/
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

        /**事件类型*/
        @JsonProperty("Type")
        private String Type;

        /**对象*/
        @JsonProperty("Object")
        private DataSetDtoObjectDto Object;

        @Data
        @ToString
        public static class DataSetDtoObjectDto {
            /**对象类型*/
            @JsonProperty("Kind")
            private String Kind;

            /**对象名称*/
            @JsonProperty("Name")
            private String Name;

        }

        /**原因*/
        @JsonProperty("Reason")
        private String Reason;

        /**消息*/
        @JsonProperty("Message")
        private String Message;

        /**事件源*/
        @JsonProperty("Source")
        private DataSetDtoSourceDto Source;

        @Data
        @ToString
        public static class DataSetDtoSourceDto {
            /**组件*/
            @JsonProperty("Component")
            private String Component;

        }

        /**出现次数*/
        @JsonProperty("Count")
        private Integer Count;

    }

}
