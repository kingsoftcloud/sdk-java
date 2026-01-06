package ksyun.client.cdn.setdomainlogservice.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetDomainLogServiceResponse
* @Description SetDomainLogService 返回体
*/
@Data
@ToString
public class SetDomainLogServiceResponse extends BaseResponseModel {

    /**SetDomainLogService*/
    @JsonProperty("SetDomainLogService")
    private String SetDomainLogService;

}
