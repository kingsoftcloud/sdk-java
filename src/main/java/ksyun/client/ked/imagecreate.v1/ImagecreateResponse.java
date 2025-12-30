package ksyun.client.ked.imagecreate.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ImagecreateResponse
* @Description Imagecreate 返回体
*/
@Data
@ToString
public class ImagecreateResponse extends BaseResponseModel {

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
        /**镜像ID*/
        @JsonProperty("imageID")
        private Integer ImageID;

    }

}
