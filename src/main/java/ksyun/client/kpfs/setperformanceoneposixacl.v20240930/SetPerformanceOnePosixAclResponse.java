package ksyun.client.kpfs.setperformanceoneposixacl.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetPerformanceOnePosixAclResponse
* @Description SetPerformanceOnePosixAcl 返回体
*/
@Data
@ToString
public class SetPerformanceOnePosixAclResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**新建成功后生成的POSIX访问授权规则唯一ID*/
    @JsonProperty("PosixAclId")
    private String PosixAclId;

}
