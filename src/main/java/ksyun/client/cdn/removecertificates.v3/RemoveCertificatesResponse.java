package ksyun.client.cdn.removecertificates.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RemoveCertificatesResponse
* @Description RemoveCertificates 返回体
*/
@Data
@ToString
public class RemoveCertificatesResponse extends BaseResponseModel {

    /**RemoveCertificates*/
    @JsonProperty("RemoveCertificates")
    private String RemoveCertificates;

}
