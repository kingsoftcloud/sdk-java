package ksyun.client.kpfs.updateperformancenfsaclip.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdatePerformanceNfsAclIpResponse
* @Description UpdatePerformanceNfsAclIp 返回体
*/
@Data
@ToString
public class UpdatePerformanceNfsAclIpResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
