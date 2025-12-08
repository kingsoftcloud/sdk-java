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

    /***/
    @JsonProperty("DataSet")
    private List<DataSetDto> DataSet;

    @Data
    @ToString
    public static class DataSetDto {
        /**2024-11-03T10:15:30Z*/
        @JsonProperty("FirstSeen")
        private String FirstSeen;

        /**2024-11-03T10:15:30Z*/
        @JsonProperty("LastSeen")
        private String LastSeen;

        /**Normal*/
        @JsonProperty("Type")
        private String Type;

        /**trainjob/pytorch-job-example-worker-0*/
        @JsonProperty("Object")
        private ObjectDto Object;

        @Data
        @ToString
        public static class ObjectDto {
            /***/
            @JsonProperty("Kind")
            private String Kind;

            /***/
            @JsonProperty("Namespace")
            private String Namespace;

            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("UID")
            private String UID;

            /***/
            @JsonProperty("APIVersion")
            private String APIVersion;

            /***/
            @JsonProperty("ResourceVersion")
            private String ResourceVersion;

            /***/
            @JsonProperty("FieldPath")
            private String FieldPath;

        }

        /**原因*/
        @JsonProperty("Reason")
        private String Reason;

        /**具体信息*/
        @JsonProperty("Message")
        private String Message;

        /***/
        @JsonProperty("Source")
        private SourceDto Source;

        @Data
        @ToString
        public static class SourceDto {
            /**kubelet*/
            @JsonProperty("component")
            private String Component;

            /**node-1.example.com*/
            @JsonProperty("host")
            private String Host;

        }

        /**1*/
        @JsonProperty("Count")
        private Integer Count;

    }

}
