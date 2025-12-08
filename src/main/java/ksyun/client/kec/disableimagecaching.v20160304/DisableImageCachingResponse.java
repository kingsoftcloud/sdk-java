package ksyun.client.kec.disableimagecaching.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DisableImageCachingResponse
* @Description DisableImageCaching 返回体
*/
@Data
@ToString
public class DisableImageCachingResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private String ReturnField;

    /***/
    @JsonProperty("Message")
    private String Message;

}
