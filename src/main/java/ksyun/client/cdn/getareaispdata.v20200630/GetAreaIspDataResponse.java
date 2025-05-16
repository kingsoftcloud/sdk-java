package ksyun.client.cdn.getareaispdata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname GetAreaIspDataResponse
 * @Description GetAreaIspData 返回体
 */
@Data
@ToString
public class GetAreaIspDataResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
