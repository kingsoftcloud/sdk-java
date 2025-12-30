package ksyun.client.ked.imagedelete.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ImagedeleteResponse
* @Description Imagedelete 返回体
*/
@Data
@ToString
public class ImagedeleteResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private Boolean Data;

}
