package ksyun.client.kce.deleterelease.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteReleaseResponse
* @Description DeleteRelease 返回体
*/
@Data
@ToString
public class DeleteReleaseResponse extends BaseResponseModel {

    /**请求 Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
