package ksyun.client.kce.rollbackrelease.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RollbackReleaseResponse
* @Description RollbackRelease 返回体
*/
@Data
@ToString
public class RollbackReleaseResponse extends BaseResponseModel {

    /**请求 Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
