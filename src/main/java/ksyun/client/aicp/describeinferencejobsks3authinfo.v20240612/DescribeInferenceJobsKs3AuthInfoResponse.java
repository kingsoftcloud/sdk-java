package ksyun.client.aicp.describeinferencejobsks3authinfo.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInferenceJobsKs3AuthInfoResponse
* @Description DescribeInferenceJobsKs3AuthInfo 返回体
*/
@Data
@ToString
public class DescribeInferenceJobsKs3AuthInfoResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Id")
    private String Id;

    /***/
    @JsonProperty("Ak")
    private String Ak;

    /***/
    @JsonProperty("Sk")
    private String Sk;

    /**是否需要授权*/
    @JsonProperty("NeedCreateRole")
    private Boolean NeedCreateRole;

}
