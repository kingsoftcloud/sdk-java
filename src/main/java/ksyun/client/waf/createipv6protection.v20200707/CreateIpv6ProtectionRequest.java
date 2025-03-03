package ksyun.client.waf.createipv6protection.v20200707;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname CreateIpv6ProtectionRequest
 * @Description 请求参数
 */
@Data
public class CreateIpv6ProtectionRequest {
    /***/
    @KsYunField(name = "ResourceRecordId", type = 2)
    private List<String> ResourceRecordIdList;

}