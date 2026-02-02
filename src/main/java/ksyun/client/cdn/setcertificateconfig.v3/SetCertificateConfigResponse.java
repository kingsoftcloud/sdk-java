package ksyun.client.cdn.setcertificateconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetCertificateConfigResponse
* @Description SetCertificateConfig 返回体
*/
@Data
@ToString
public class SetCertificateConfigResponse extends BaseResponseModel {

    /**ConfigCertificateResponse*/
    @JsonProperty("ConfigCertificateResponse")
    private String ConfigCertificateResponse;

}
