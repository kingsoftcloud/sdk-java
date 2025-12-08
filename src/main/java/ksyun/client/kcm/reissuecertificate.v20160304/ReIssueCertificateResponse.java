package ksyun.client.kcm.reissuecertificate.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ReIssueCertificateResponse
* @Description ReIssueCertificate 返回体
*/
@Data
@ToString
public class ReIssueCertificateResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ReIssueCertificateResponse")
    private String ReIssueCertificateResponse;

}
