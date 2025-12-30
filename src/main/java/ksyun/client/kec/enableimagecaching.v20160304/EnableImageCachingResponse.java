package ksyun.client.kec.enableimagecaching.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EnableImageCachingResponse
* @Description EnableImageCaching 返回体
*/
@Data
@ToString
public class EnableImageCachingResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
