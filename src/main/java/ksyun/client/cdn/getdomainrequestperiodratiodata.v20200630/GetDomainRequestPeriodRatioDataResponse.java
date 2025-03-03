package ksyun.client.cdn.getdomainrequestperiodratiodata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetDomainRequestPeriodRatioDataResponse
 * @Description GetDomainRequestPeriodRatioData 返回体
 */
@Data
@ToString
public class GetDomainRequestPeriodRatioDataResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
