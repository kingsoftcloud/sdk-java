package ksyun.client.kpfs.updateperformanceoneposixacl.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdatePerformanceOnePosixAclResponse
* @Description UpdatePerformanceOnePosixAcl 返回体
*/
@Data
@ToString
public class UpdatePerformanceOnePosixAclResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
