package ksyun.client.cdn.getentryratedata.v20200630;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetEntryRateDataResponse
* @Description GetEntryRateData 返回体
*/
@Data
@ToString
public class GetEntryRateDataResponse extends BaseResponseModel {
    /***/
    @JsonProperty("EcnEntryRateDataResponse")
    private EcnEntryRateDataResponseDto EcnEntryRateDataResponse;

    @Data
    @ToString
    public static class EcnEntryRateDataResponseDto {
    }

}
