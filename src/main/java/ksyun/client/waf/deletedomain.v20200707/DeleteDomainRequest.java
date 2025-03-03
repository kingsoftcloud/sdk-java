package ksyun.client.waf.deletedomain.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDomainRequest
 * @Description 请求参数
 */
@Data
public class DeleteDomainRequest {
    /**
     * 描述：域名记录的ID
     */
    @KsYunField(name = "ResourceRecordId")
    private String ResourceRecordId;

}