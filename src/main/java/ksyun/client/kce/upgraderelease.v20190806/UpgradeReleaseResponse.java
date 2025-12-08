package ksyun.client.kce.upgraderelease.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpgradeReleaseResponse
* @Description UpgradeRelease 返回体
*/
@Data
@ToString
public class UpgradeReleaseResponse extends BaseResponseModel {
    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
