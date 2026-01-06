package ksyun.client.cdn.associatecertificateconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AssociateCertificateConfigResponse
* @Description AssociateCertificateConfig 返回体
*/
@Data
@ToString
public class AssociateCertificateConfigResponse extends BaseResponseModel {

    /**ConfigCertificateResponse*/
    @JsonProperty("ConfigCertificateResponse")
    private String ConfigCertificateResponse;

}
