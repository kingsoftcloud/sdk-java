package ksyun.client.cdn.setcertificate.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetCertificateResponse
* @Description SetCertificate 返回体
*/
@Data
@ToString
public class SetCertificateResponse extends BaseResponseModel {

    /**证书对应的唯一ID*/
    @JsonProperty("CertificateId")
    private String CertificateId;

}
