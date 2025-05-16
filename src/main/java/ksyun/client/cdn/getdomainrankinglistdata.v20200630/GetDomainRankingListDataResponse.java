package ksyun.client.cdn.getdomainrankinglistdata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname GetDomainRankingListDataResponse
 * @Description GetDomainRankingListData 返回体
 */
@Data
@ToString
public class GetDomainRankingListDataResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
