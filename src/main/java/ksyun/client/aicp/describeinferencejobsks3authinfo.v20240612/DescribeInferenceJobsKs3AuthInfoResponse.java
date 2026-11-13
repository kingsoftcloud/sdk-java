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

    /**数据库主键*/
    @JsonProperty("Id")
    private String Id;

    /**KS3 临时访问密钥(Access Key)*/
    @JsonProperty("Ak")
    private String Ak;

    /**KS3 临时安全密钥(Secret Key)*/
    @JsonProperty("Sk")
    private String Sk;

    /**是否需要授权*/
    @JsonProperty("NeedCreateRole")
    private Boolean NeedCreateRole;

}
