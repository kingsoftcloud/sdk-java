package ksyun.client.waf.createalbwaf.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAlbWafResponse
* @Description CreateAlbWaf 返回体
*/
@Data
@ToString
public class CreateAlbWafResponse extends BaseResponseModel {

    /**waf信息*/
    @JsonProperty("WafInfo")
    private WafInfoDto WafInfo;

    @Data
    @ToString
    public static class WafInfoDto {
    }

}
