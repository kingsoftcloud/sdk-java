package ksyun.client.cdn.getdomainhttpcodedetaileddata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDomainHttpCodeDetailedDataResponse
* @Description GetDomainHttpCodeDetailedData 返回体
*/
@Data
@ToString
public class GetDomainHttpCodeDetailedDataResponse extends BaseResponseModel {

    /***/
    @JsonProperty("StartTime")
    private String StartTime;

}
