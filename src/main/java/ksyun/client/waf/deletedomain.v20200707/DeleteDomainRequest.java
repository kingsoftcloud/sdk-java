package ksyun.client.waf.deletedomain.v20200707;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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