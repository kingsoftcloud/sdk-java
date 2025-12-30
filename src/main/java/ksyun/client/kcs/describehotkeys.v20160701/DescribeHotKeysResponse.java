package ksyun.client.kcs.describehotkeys.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeHotKeysResponse
* @Description DescribeHotKeys 返回体
*/
@Data
@ToString
public class DescribeHotKeysResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("count")
        private Integer Count;

        /***/
        @JsonProperty("total")
        private Integer Total;

        /***/
        @JsonProperty("updated")
        private String Updated;

        /***/
        @JsonProperty("task_status")
        private String Task_status;

        /***/
        @JsonProperty("hotkeys")
        private List<DataHotkeysDto> Hotkeys;

        @Data
        @ToString
        public static class DataHotkeysDto {
            /***/
            @JsonProperty("count")
            private Integer Count;

            /***/
            @JsonProperty("elements")
            private String Elements;

            /***/
            @JsonProperty("key")
            private String Key;

            /***/
            @JsonProperty("encoding")
            private String Encoding;

            /***/
            @JsonProperty("type")
            private String Type;

            /***/
            @JsonProperty("expiry")
            private Integer Expiry;

            /***/
            @JsonProperty("db")
            private Integer Db;

            /***/
            @JsonProperty("len_largest_element")
            private String Len_largest_element;

            /***/
            @JsonProperty("size")
            private Integer Size;

        }

        /***/
        @JsonProperty("created")
        private String Created;

    }

}
