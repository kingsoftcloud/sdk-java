package ksyun.client.cdn.gettopurldata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetTopUrlDataResponse
 * @Description GetTopUrlData 返回体
 */
@Data
@ToString
public class GetTopUrlDataResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
