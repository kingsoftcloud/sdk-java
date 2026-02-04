package ksyun.client.kpfs.setperformanceonenfsacl.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetPerformanceOneNfsAclResponse
* @Description SetPerformanceOneNfsAcl 返回体
*/
@Data
@ToString
public class SetPerformanceOneNfsAclResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**规则ID。*/
    @JsonProperty("NfsAclId")
    private String NfsAclId;

}
