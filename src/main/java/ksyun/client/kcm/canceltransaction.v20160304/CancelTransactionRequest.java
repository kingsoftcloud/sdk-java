package ksyun.client.kcm.canceltransaction.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CancelTransactionRequest
* @Description 请求参数
*/
@Data
public class CancelTransactionRequest{
    /**证书ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

}
