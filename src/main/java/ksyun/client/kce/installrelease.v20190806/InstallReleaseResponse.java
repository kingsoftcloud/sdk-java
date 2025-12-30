package ksyun.client.kce.installrelease.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname InstallReleaseResponse
* @Description InstallRelease 返回体
*/
@Data
@ToString
public class InstallReleaseResponse extends BaseResponseModel {

    /**请求 Id*/
    @JsonProperty("ReuestId")
    private String ReuestId;

}
