package ksyun.client.waf.deleteipv6protection.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DeleteIpv6ProtectionRequest
 * @Description 请求参数
 */
@Data
public class DeleteIpv6ProtectionRequest {
    /***/
    @KsYunField(name = "ResourceRecordId", type = 2)
    private List<String> ResourceRecordIdList;

}