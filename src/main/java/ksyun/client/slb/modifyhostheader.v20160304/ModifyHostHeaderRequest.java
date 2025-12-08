package ksyun.client.slb.modifyhostheader.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyHostHeaderRequest
* @Description 请求参数
*/
@Data
public class ModifyHostHeaderRequest{
    /**域名的ID*/
    @KsYunField(name="HostHeaderId")
    private String HostHeaderId;

    /**证书的ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

}
