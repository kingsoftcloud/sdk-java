package ksyun.client.waf.deletealbdomain.v20200707;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteAlbDomainRequest
 * @Description 请求参数
 */
@Data
public class DeleteAlbDomainRequest {
    /**
     * 描述：域名记录的ID
     */
    @KsYunField(name = "ResourceRecordId")
    private String ResourceRecordId;

}