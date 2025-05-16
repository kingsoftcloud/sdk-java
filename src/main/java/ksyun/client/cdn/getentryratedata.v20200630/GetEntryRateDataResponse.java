package ksyun.client.cdn.getentryratedata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname GetEntryRateDataResponse
 * @Description GetEntryRateData 返回体
 */
@Data
@ToString
public class GetEntryRateDataResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
