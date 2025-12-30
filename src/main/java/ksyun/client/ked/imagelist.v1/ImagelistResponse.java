package ksyun.client.ked.imagelist.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ImagelistResponse
* @Description Imagelist 返回体
*/
@Data
@ToString
public class ImagelistResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("pageNum")
        private Integer PageNum;

        /***/
        @JsonProperty("pageSize")
        private Integer PageSize;

        /***/
        @JsonProperty("totalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("records")
        private List<DataRecordsDto> Records;

        @Data
        @ToString
        public static class DataRecordsDto {
            /***/
            @JsonProperty("id")
            private Integer Id;

            /***/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("accountId")
            private Integer AccountId;

            /***/
            @JsonProperty("imageType")
            private String ImageType;

            /***/
            @JsonProperty("imageSize")
            private String ImageSize;

            /***/
            @JsonProperty("description")
            private String Description;

            /***/
            @JsonProperty("status")
            private Integer Status;

            /***/
            @JsonProperty("imageId")
            private String ImageId;

            /***/
            @JsonProperty("systemType")
            private String SystemType;

            /***/
            @JsonProperty("systemVersion")
            private String SystemVersion;

            /***/
            @JsonProperty("createTime")
            private String CreateTime;

            /***/
            @JsonProperty("updateTime")
            private String UpdateTime;

        }

    }

}
