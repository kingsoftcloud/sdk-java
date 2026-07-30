package ksyun.client.aicp.getpublicimagelist.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetPublicImageListResponse
* @Description GetPublicImageList 返回体
*/
@Data
@ToString
public class GetPublicImageListResponse extends BaseResponseModel {

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
        @JsonProperty("ImageSet")
        private List<DataImageSetDto> ImageSet;

        @Data
        @ToString
        public static class DataImageSetDto {
            /***/
            @JsonProperty("ImageUrl")
            private String ImageUrl;

            /***/
            @JsonProperty("ImageType")
            private String ImageType;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("ImageSize")
            private Double ImageSize;

            /***/
            @JsonProperty("ImageVersion")
            private String ImageVersion;

        }

    }

}
